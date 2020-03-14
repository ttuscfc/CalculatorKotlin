package br.ufpr.tads.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.ufpr.tads.calculatorkotlin.R.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val primeiroNum = findViewById<EditText>(id.primeiroNum)
        val segundoNum = findViewById<EditText>(id.segundoNum)
        val buttonSum = findViewById<Button>(id.buttonSum)
        val buttonSubstract = findViewById<Button>(id.buttonSubstract)
        val buttonMultiplication = findViewById<Button>(id.buttonMultiplication)
        val buttonDivision = findViewById<Button>(id.buttonDivision)
        buttonSum.setOnClickListener {
            val soma = (primeiroNum.text.toString().toDouble() + segundoNum.text.toString().toDouble())
            val text = soma.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }
        buttonSubstract.setOnClickListener {
            val subtracao = (primeiroNum.text.toString().toDouble() - segundoNum.text.toString().toDouble())
            val text = subtracao.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }
        buttonMultiplication.setOnClickListener {
            val multiplicacao = (primeiroNum.text.toString().toDouble() * segundoNum.text.toString().toDouble())
            val text = multiplicacao.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }
        buttonDivision.setOnClickListener {
            val divisao = (primeiroNum.text.toString().toDouble() / segundoNum.text.toString().toDouble())
            val text = divisao.toString()
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }


    }
}
