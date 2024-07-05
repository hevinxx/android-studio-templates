#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
#parse("File Header.java")
@Composable
fun ${FILE_NAME}() {
}

@Preview()
@Composable
fun ${FILE_NAME}Preview() {
    ${FILE_NAME}()
}