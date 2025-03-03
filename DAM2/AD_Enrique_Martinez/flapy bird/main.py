sfrom asyncio import events
import pygame
import time
import os
import random


WIN_WITH = 580
WIN_HEIGHT= 900

BIRD_IMG = pygame.transform.scale2x(pygame.image.load(os.path.join("img","bird1.png")))
BG_IMG = pygame.transform.scale2x(pygame.image.load(os.path.join("img","bg.png")))


class Bird:
    IMG = BIRD_IMG
    def _init_(self, x, y):#Reemplazamos el main y le pasamos todo que hay propio de la clase.
        self.x = x
        self.y = y
        self.tilt = 0 #degrees to tilt
        self.vel = 0
        self.tick_count = 0
        self.img = self.IMG
        self.height = self.y
        self.img_count = 0

    def jump(self):
        pass

    def draw(self,window):
        rotated_img = pygame.transform.rotate(self.img,self.tilt)
        new_rectangle = rotated_img.get_rect(center = self.img.get_rect(topleft = (self.x,self.y)).center)
        window.blit(rotated_img, new_rectangle.topleft)

def draw_window(win,bird):
    win.blit(BG_IMG,(0,0))
    bird.draw(win)
    pygame.display.update()

def move(win,x,y):
    win.blit(BG_IMG,(x,y))
    pygame.display.update()
    
def game():
    bird = Bird(200,300)
    window = pygame.display.set_mode((WIN_WITH,WIN_HEIGHT))

    run = True
    while(run):
        events = pygame.event.get()
        for event in pygame.event.get():
            #Cuando se quita el juego
            if event.type is pygame.QUIT:
                run=False
            #Detectar todos los eventos que se producen
            if event.type == pygame.KEYDOWN:
                    if event.key == pygame.K_LEFT:
                        bird.x-= 100
                        move(window,bird.x,0)
                    if event.key == pygame.K_RIGHT:
                        bird.x+= 100            
                        move(window,bird.x,0)
            draw_window(window,bird)

    pygame.quit()
    quit()

game()