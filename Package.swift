// swift-tools-version: 5.7

import PackageDescription

let package = Package(
    name: "kmp-sample",
    platforms: [
         .iOS(.v14),
     ],
    products: [
        .library(
            name: "shared",
            targets: ["shared"]),
        .library(
            name: "sample",
            targets: ["sample"]),
    ],
    dependencies: [],
    targets: [
        .binaryTarget(
            name: "shared",
            path: "library/shared/build/XCFrameworks/debug/shared.xcframework"),
        .binaryTarget(
            name: "sample",
            path: "sample/shared/build/XCFrameworks/debug/shared.xcframework"),
    ]
)
