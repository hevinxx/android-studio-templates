#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
#parse("File Header.java")
class ${FILE_NAME} : AppCompatActivity() {

    private lateinit var binding: ${View_binding}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ${View_binding}.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
