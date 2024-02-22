package com.example.android.exemplo66

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    val COD_TELA = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnPagar_click() {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent(this, PagarActivity::class.java).apply {
            putExtra("sSaldo", saldo)
        }
        startActivityForResult(intent, COD_TELA)

    }

    fun btnPix_click(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent(this, PixActivity::class.java).apply {
            putExtra("sSaldo", saldo)
        }
        startActivityForResult(intent, COD_TELA)

    }

    fun btnDepos_click(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent(this, Depositar::class.java).apply {
            putExtra("sSaldo", saldo)
        }
        startActivityForResult(intent, COD_TELA)
    }

    fun btnTransf_click(view: View) {
        val txtSaldo = findViewById<TextView>(R.id.txtSaldo)
        val saldo = txtSaldo.text.toString()
        val intent = Intent(this, Transferencia::class.java).apply {
            putExtra("sSaldo", saldo)
        }
        startActivityForResult(intent, COD_TELA)
    }
}










