import UIKit
import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        KmpPageKt.KmpPage()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {
    }
}
