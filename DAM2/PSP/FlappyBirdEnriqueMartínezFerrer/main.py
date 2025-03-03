import pygame
import os
import random

WIN_WIDTH = 500
WIN_HEIGHT = 800

BIRD_IMG = pygame.transform.scale2x(pygame.image.load(os.path.join("img", "bird1.png")))
BG_IMG = pygame.transform.scale2x(pygame.image.load(os.path.join("img", "bg.png")))
PIPE_IMG = pygame.transform.scale2x(pygame.image.load(os.path.join("img", "pipe.png")))
PIPE_IMGDOWN = pygame.transform.flip(PIPE_IMG,False,True)


class Pipe:
    IMG_UP = PIPE_IMG
    IMG_DOWN = PIPE_IMGDOWN
    GAP = 200



    def __init__(self):
        self.x = WIN_WIDTH
        self.height = random.randint(50,450)
        self.top = self.height - self.IMG_UP.get_height()
        self.vel = 5


    def move(self,puntos):
        self.vel=5+(puntos*0.1)**2#Funcion Exponencial Sencilla
        self.x -= self.vel



    def draw(self, window):
        window.blit(self.IMG_DOWN,(self.x,self.top))
        window.blit(self.IMG_UP,(self.x,self.height+self.GAP))





class Bird:
    IMG = BIRD_IMG
    ANCHURA = 50

    def __init__(self,x,y):
        self.x = x
        self.y = y
        self.tick_count = 0
        self.vel = 0
        self.img = self.IMG
        self.tilt = 0

    def jump(self):
        self.vel = -12
        self.tick_count = 0

    def draw(self,window):
        rotated_img = pygame.transform.rotate(self.img, self.tilt)
        new_rectangle = rotated_img.get_rect(center=self.img.get_rect(topleft=(self.x,self.y)).center)
        window.blit(rotated_img, new_rectangle.topleft)

    def move(self):
        self.tick_count += 1

        gravity = 3
        d = self.vel*self.tick_count + 0.5*gravity*(self.tick_count)**2

        if d > 16:
            d = 16

        self.y += d


def draw_window(window, bird, pipe):
    window.blit(BG_IMG, (0, 0))
    bird.draw(window)
    pipe.draw(window)
    pygame.display.update()


def game():
    bird = Bird(200, 300)
    pipe = Pipe()
    window = pygame.display.set_mode((WIN_WIDTH, WIN_HEIGHT))

    clock = pygame.time.Clock()

    puntuacion=0

    run = True
    fuente_puntos=pygame.font.SysFont("arial",70)

    while run:
        clock.tick(30)
        for event in pygame.event.get():
            # Detectar todos los eventos que se producen

            # Cuando se cierra el juego
            if event.type == pygame.QUIT:
                run = False

            if event.type == pygame.KEYDOWN:
                if event.key == pygame.K_SPACE:
                    bird.jump()

        bird.move()

        pipe.move(puntuacion)

        if bird.x+bird.IMG.get_width()>pipe.x and bird.x+bird.IMG.get_width()-pipe.vel<=pipe.x:
            puntuacion+=1

        #Miramos Si se encuentra por encima o debajo del nivel de las tuberías
        if pipe.height>=bird.y or pipe.height+pipe.GAP<=bird.y+bird.IMG.get_height():
            #Vemos si la parte de la izquierda se encuentra entre las tuberías, esto dentro del if que comprueba si está por encima o debajo de la tubería
            if pipe.x<=bird.x<=pipe.x+pipe.IMG_UP.get_width():
                run=False
            #Comprobamos lo mismo de arriba pero con la parte derecha del pájaro
            elif pipe.x<=bird.x+bird.IMG.get_width()<=pipe.x+pipe.IMG_UP.get_width():
                run=False
        if pipe.x + pipe.IMG_UP.get_width() < 0:
            pipe=Pipe()

        #Declaramos el Texto de los puntos con la fuente adecuada
        texto_puntos=fuente_puntos.render(str(puntuacion),0,(255,0,0))

        draw_window(window,bird,pipe)
        #Pintamos el Texto
        window.blit(texto_puntos,(WIN_WIDTH/2,100))
        #Actualizamos la Pantalla
        pygame.display.update()

    quit()


pygame.init() 
game()


