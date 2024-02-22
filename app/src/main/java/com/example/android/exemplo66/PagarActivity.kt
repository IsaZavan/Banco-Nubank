package com.example.android.exemplo66

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PagarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagar2)
        setSupportActionBar(findViewById(R.id.toolbar3))
        val btnConf = findViewById<Button>(R.id.btnPagar_click)
        val txtsaldo = intent.getStringExtra("sSaldo")
        var nsaldo = txtsaldo.toString().toDouble()


        btnConf.setOnClickListener {
            val data = Intent()
            val edtPagar = findViewById<EditText>(R.id.edtChave)

            val edtValor = findViewById<EditText>(R.id.edtValorPagar)
            val nvalor = edtValor.text.toString().toDouble()

            if(nsaldo<nvalor) {
                Toast.makeText(this,"Saldo de $nsaldo é insuficiente", Toast.LENGTH_SHORT).show()
            }
            else {
                nsaldo -= nvalor
            }

            val txtSaldo = nsaldo.toString()
            data.putExtra("sSaldo",txtSaldo)
            setResult(Activity.RESULT_OK,data)
            Toast.makeText(this,"$nsaldo", Toast.LENGTH_SHORT).show()
            edtPagar.setText("".toString())
            edtValor.setText("".toString())
            finish()


        }
    }
}
