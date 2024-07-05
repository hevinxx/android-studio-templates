# android-studio-templates
A collection of ready-to-use templates for Android Studio, designed to streamline your development process especially with Android Compose.

## Installation and Usage
### Setup 
1. Download this repository
2. To find the Android Studio config directory, open Android Studio and navigate to File > Manage IDE Settings > Export Settings.... The path shown in the "Export settings to:" field is the config directory.
3. Place the `fileTemplates` folder and the `templates` folder into the config directory.
4. Restart Android Studio.
### Verification
After restarting Android Studio, you can verify the templates have been added:
- File and Code Templates: Go to Preferences > Editor > File and Code Templates.
- Live Templates: Go to Preferences > Editor > Live Templates.
### Usage
- File and Code Templates: These templates can be selected as options when creating a new file.
- Live Templates: These templates can be used anytime by typing the abbreviation and pressing the Tab key.
## Available Templates
### File and Code Templates
- Android Activity: Ideal for creating a new Activity in a new file.
- Android Fragment: Ideal for creating a new Fragment in a new file.
- Android Activity: Ideal for creating a new Activity with view binding in a new file.
- Android Fragment: Ideal for creating a new Fragment with view binding in a new file.
- Kotlin Composable: Ideal for creating a new Composable function in a new file.
### Live Templates
- modi: Inserts a default Modifier.
- liveData: Conveniently inserts a pair of MutableLiveData and LiveData.
- parcelize: Make a parcelable class with parcelize annotation.
- parcelizeData: Make a parcelable data class with parcelize annotation.
- remst: Create a mutable state and remember it.
- try: Quickly inserts a try/catch block.
- viewBindingActivity: Create a view-binded activity.
- viewBindingFragment: Create a view-binded fragment.
These templates are designed to save you time and effort during development by providing reusable code snippets and structures.

