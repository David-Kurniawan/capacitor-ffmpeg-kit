import Foundation

@objc public class Ffmpegkit: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
