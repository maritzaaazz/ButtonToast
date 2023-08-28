package com.example.toasttugas1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toasttugas1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //untuk menghubungkan layout XML yang Anda buat dalam file activity_main.xml dengan kode Kotlin dalam kelas MainActivity
        var binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnTest1.setOnClickListener{
                //Mengambil teks dari EditText untuk username
                val username = edtUsername.text.toString()
                //Memeriksa apakah bidang username tidak kosong
                if (username.isNotEmpty()) {
                    //Membuat pesan dengan nama pengguna yang berhasil login
                    val message = "Hallo, $username berhasil login!"
                    //Menampilkan pesan Toast dengan pesan yang telah dibuat
                    Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
                } else {
                    //Jika bidang username kosong, tampilkan pesan Toast bahwa username belum diisi
                    Toast.makeText(this@MainActivity, "Username belum diisi", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}