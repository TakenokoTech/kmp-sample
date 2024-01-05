package tech.takenoko.android.kmp.library

import platform.UIKit.UIDevice

class IOSPlatform : SharedPlatform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): SharedPlatform = IOSPlatform()
