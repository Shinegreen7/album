package app.kohama.midorikun.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preview = Intent(this, PreviewActivity::class.java)


        albumImage1.setOnClickListener {

            preview.putExtra("image", R.drawable.sea_image)

            preview.putExtra("title", "海")

            val preview: Intent = Intent(this, PreviewActivity::class.java)
                .putExtra("image", R.drawable.sea_image)
                .putExtra("title", "海")

            startActivity(preview)


        }
    }
}
