#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
#parse("File Header.java")
class ${FILE_NAME} : Fragment() {

    private var _binding: ${View_binding}? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ${View_binding}.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    
    companion object {
        fun newInstance(): ${FILE_NAME} {
            val args = Bundle()
            val fragment = ${FILE_NAME}()
            fragment.arguments = args
            return fragment
        }
    }
}