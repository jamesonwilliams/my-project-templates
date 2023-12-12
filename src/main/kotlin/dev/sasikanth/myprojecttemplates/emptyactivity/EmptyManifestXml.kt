package dev.sasikanth.myprojecttemplates.emptyactivity

import org.jetbrains.kotlin.lombok.utils.capitalize

fun emptyManifestXml(itemName: String, styleName: String) = """
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET" />
    <application
        android:name=".${itemName.capitalize()}Application"
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="$styleName"
        tools:targetApi="31">
        <activity
            android:name=".ui.MainActivity"
            android:exported="true"
            android:theme="$styleName">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
"""