#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
#parse("File Header.java")
class ${FILE_NAME} : AppCompatActivity(R.layout.${Layout_name}) {
}
