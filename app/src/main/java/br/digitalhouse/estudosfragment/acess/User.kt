package br.digitalhouse.estudosfragment.acess

import android.widget.Toast

class User : UserValidation {

    lateinit var listaL : List<String>
    lateinit var listaC : List<String>

    fun criarListas(){
        listaC = listOf<String>(".",",","#","@","!","/","?","*","&","(",")","+","-","=")
        listaL = listOf<String>("A","B","C","D","E","F","G","H","I","J","K","L","M","N",
        "N","O","P","Q","R","S","T","U","V","W","X","Y","Z")
    }

    override fun validaSenha(senha : String) : Boolean{
       var caracterEspecial : Boolean = false
       var letraM : Boolean = false
       var letram : Boolean = false

        criarListas()
        //valida se contem caracter especial
       for (caracter in listaC){
           if(senha.contains(caracter)) {
               caracterEspecial = true;
               break
           }
       }

        //valida se contem letra maiuscula
        for (maiuscula in listaL){
            if(senha.contains(maiuscula)) {
                letraM = true
                break
            }
        }

        //valida se contem letra minuscula
        for (maiuscula in listaL){
            if(senha.contains(maiuscula.toLowerCase())){
                letram = true
                break
            }
        }

        //valida se a senha possiu 8 caracteres
        if (senha.length < 8) return false

        return caracterEspecial && letraM && letram
    }


}