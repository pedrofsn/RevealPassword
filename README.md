# RevealPassword [![](https://www.jitpack.io/v/pedrofsn/RevealPassword.svg)](https://www.jitpack.io/#pedrofsn/RevealPassword)
An android small library to show and hide password in a EditText.

# Download
Download the latest version in [JitPack](https://www.jitpack.io/#pedrofsn/RevealPassword/) or Gradle bellow
```
implementation 'com.github.pedrofsn:RevealPassword:1.0.2'
```

# How to use
Using only XML:
``` 
    <br.com.redcode.revealpassword.library.EditTextWithImageForRevealPassword
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:drawableRevealPassword="@android:drawable/ic_menu_add"
        app:hint="Custom Hint Hardcoded" />
```
        
Using XML and JAVA/Kotlin:
``` 
    <EditText
        android:id="@+id/editTextSampleFunction"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:inputType="textWebPassword"
        android:text="\@pedrofsn" />

    <Button
        android:id="@+id/buttonShowHidePassword"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Show/hide password" />
```
``` 
 buttonShowHidePassword.setOnClickListener { editTextSampleFunction.showOrHidePassword() }
 ```

You can see more samples in [XML](https://github.com/pedrofsn/RevealPassword/blob/master/app/src/main/res/layout/activity_main.xml) and [Java/Kotlin](https://github.com/pedrofsn/RevealPassword/blob/master/app/src/main/java/br/com/redcode/revealpassword/sample/MainActivity.kt).

Attention: If you're using [TextInputLayout from Material Components](https://github.com/material-components/material-components-android/blob/master/lib/java/com/google/android/material/textfield/TextInputLayout.java). You can use [builtin solution](https://material.io/develop/android/components/text-input-layout/#common-features) for this problem domain.
