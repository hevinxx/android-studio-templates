#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
#parse("File Header.java")
class ${FILE_NAME} : Fragment(R.layout.${Layout_name}) {
    
    companion object {
        fun newInstance(): ${FILE_NAME} {
            val args = Bundle()
            val fragment = ${FILE_NAME}()
            fragment.arguments = args
            return fragment
        }
    }
}