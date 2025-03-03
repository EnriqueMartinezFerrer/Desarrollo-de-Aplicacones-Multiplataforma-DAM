package com.example.examen_ev_enriquemartinez
    import android.content.res.Configuration
    import android.os.Bundle
    import android.util.Log
    import android.view.View
    import android.widget.AdapterView
    import android.widget.AdapterView.OnItemSelectedListener
    import androidx.appcompat.app.AppCompatActivity
    import androidx.recyclerview.widget.LinearLayoutManager
    import com.example.examen_ev_enriquemartinez.databinding.ActivityMainBinding
    import com.google.android.material.snackbar.Snackbar
    import com.example.examen_ev_enriquemartinez.AdapterRestaurante
    import com.example.examen_ev_enriquemartinez.Restaurante


// TODO 3. IMPLEMENTO la interfaz --> escribiendo los metodos de comunicacion
// TODO 5. Utilizo el dato comunicado como me interese en el metodo implementado --> coche comunicado

class MainActivity : AppCompatActivity(), OnItemSelectedListener {

            private lateinit var binding: ActivityMainBinding
            private lateinit var lista: ArrayList<Restaurante>
            private lateinit var restaurantesFiltrada: ArrayList<Restaurante>
            private lateinit var adapterRestaurante: AdapterRestaurante

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // si el movil está en port --> LINEAR
        // si el movil está en land --> GRID (2)

        resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE
        resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lista = ArrayList();
        lista.add(Restaurante("Italiano1", 4, "Italiano", 9111))
        lista.add(Restaurante("Italiano2", 7, "Italiano", 9222))
        lista.add(Restaurante("Italiano3", 9, "Italiano", 9333))
        lista.add(Restaurante("Italiano4", 3, "Italiano", 9444))
        lista.add(Restaurante("Italiano5", 9, "Italiano", 9555))
        lista.add(Restaurante("Mediterraneo1", 6, "Mediterranea", 9666))
        lista.add(Restaurante("Mediterraneo2", 7, "Mediterranea", 9777))
        lista.add(Restaurante("Mediterraneo3", 5, "Mediterranea", 9123))
        lista.add(Restaurante("Mediterraneo4", 2, "Mediterranea", 9234))
        lista.add(Restaurante("Chino1", 10, "Chino", 9345))
        lista.add(Restaurante("Chino2", 5, "Chino", 9456))
        lista.add(Restaurante("Chino3", 6, "Chino", 9567))
        lista.add(Restaurante("Vegetariano 1", 10, "Americano", 8123))
        lista.add(Restaurante("Vegetariano 2", 5, "Americano", 7123))
        lista.add(Restaurante("Vegetariano 3", 6, "Americano", 6234))
        lista.add(Restaurante("Americano 1", 6, "Americano", 6234))
        lista.add(Restaurante("Americano 2", 9, "Americano", 6234))
        lista.add(Restaurante("Americano 3", 6, "Americano", 6234))
        lista.add(Restaurante("Americano 4", 7, "Americano", 6234))
        adapterRestaurante = AdapterRestaurante(this, lista)
        binding.recycler.adapter = adapterRestaurante;
        binding.recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        //binding.recycler.layoutManager = GridLayoutManager(this, 2);


    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        when(p0!!.id){
            R.id.spinner_tipo->{

                val marca = binding.spinnerTipo.adapter.getItem(p2)

                if (marca == "Todos"){
                    Log.v("marca", marca.toString() + "todos")
                    restaurantesFiltrada = lista
                } else {
                    Log.v("marca", marca.toString() + "diferente")
                    restaurantesFiltrada =
                        lista.filter { it.tipo == tipo  } as ArrayList<Restaurante> // lista de los que cumplen
                }
                adapterRestaurante.setFiltrada(restaurantesFiltrada);

            }
            R.id.spinner_valoracion->{
                val valo = binding.spinnerValoracion.adapter.getItem(p2)
                restaurantesFiltrada = restaurantesFiltrada.filter {
                    when(p2){

                        1->{
                            return@filter it.valo>1
                        }
                        2->{
                            return@filter it.valo>2
                        }
                        3->{
                            return@filter it.valo>3
                        }
                        4->{
                            return@filter it.valo>4
                        }
                        5->{
                            return@filter it.valo>5
                        }
                        5->{
                            return@filter it.valo>6
                        }
                        5->{
                            return@filter it.valo>7
                        }
                        5->{
                            return@filter it.valo>8
                        }
                        5->{
                            return@filter it.valo>9
                        }
                        5->{
                            return@filter it.valo>10
                        }
                    }
                    return@filter true;

                } as ArrayList<Restaurante>
                adapterRestaurante.setFiltrada(restaurantesFiltrada)

            }
        }
    }
                    override fun onNothingSelected(p0: AdapterView<*>?) {

                    }
                }

