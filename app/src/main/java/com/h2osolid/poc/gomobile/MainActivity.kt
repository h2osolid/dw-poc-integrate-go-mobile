package com.h2osolid.poc.gomobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import golib.Golib

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Method 1
    val tvMethod1 = findViewById<AppCompatTextView>(R.id.tvMethod1)
    val btnMethod1 = findViewById<AppCompatButton>(R.id.btnMethod1)

    btnMethod1.setOnClickListener {
      tvMethod1.text = Golib.genMnenonicSlice()
    }

    // Method 2
    val tvMethod2 = findViewById<AppCompatTextView>(R.id.tvMethod2)
    val btnMethod2 = findViewById<AppCompatButton>(R.id.btnMethod2)

    btnMethod2.setOnClickListener {
      tvMethod2.text =
        Golib.genPrivateKeyHex("test test test test test test test test test test test test test test test test test test test test test test test test")
    }

    // Method 3
    val tvMethod3 = findViewById<AppCompatTextView>(R.id.tvMethod3)
    val btnMethod3 = findViewById<AppCompatButton>(R.id.btnMethod3)

    btnMethod3.setOnClickListener {
      tvMethod3.text =
        Golib.genWalletAddress("0x38af483e76d5d3f856fdb88251857c3bc57acbcc1be1844b638530ae63454633")
    }

    // Method 4
    val tvMethod4 = findViewById<AppCompatTextView>(R.id.tvMethod4)
    val btnMethod4 = findViewById<AppCompatButton>(R.id.btnMethod4)

    btnMethod4.setOnClickListener {
      tvMethod4.text = Golib.sendTransaction(
        "https://blockchain-test.changewld.com",
        "0x38af483e76d5d3f856fdb88251857c3bc57acbcc1be1844b638530ae63454633",
        "0xFcebF7fA678b1464711e8dc3f1604dafB2a4e265",
        "0xa9059cbb000000000000000000000000011c4f7024b060d5cb2398ab3f1c4e64a477f05600000000000000000000000000000000000000000000000000000000000007d0"
      )
    }
  }
}
