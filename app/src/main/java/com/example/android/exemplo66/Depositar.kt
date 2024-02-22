package com.example.android.exemplo66

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Depositar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_depositar2)
        setSupportActionBar(findViewById(R.id.toolbar4))
        val btnConf = findViewById<Button>(R.id.btnDepositar_click)
        val txtsaldo = intent.getStringExtra("sSaldo")
        var nsaldo = txtsaldo.toString().toDouble()


        btnConf.setOnClickListener {
            val data = Intent()
            val edtValorDepositar = findViewById<EditText>(R.id.edtValorDepositar)
            val nValor = edtValorDepositar.text.toString().toDouble()

            if(nsaldo<nValor) {
                Toast.makeText(this, "Saldo de $nsaldo é insuficiente", Toast.LENGTH_SHORT).show()
            }
            else {
                nsaldo += nValor
            }
            val txtSaldo = nsaldo.toString()
            data.putExtra("sSaldo",txtSaldo)
            setResult(Activity.RESULT_OK,data)
            Toast.makeText(this,"$nsaldo", Toast.LENGTH_SHORT).show()
            edtValorDepositar.setText("".toString())
            finish()


        }
    }
}