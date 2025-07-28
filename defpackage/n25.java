package defpackage;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: n25  reason: default package */
public final class n25 {
    public static final z25[] c;
    public static final z25[][] d;
    public static final HashSet e = new HashSet(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));
    public final List a;
    public final ByteOrder b;

    static {
        String str = "SubIFDPointer";
        String str2 = str;
        z25[] z25Arr = {new z25(256, "ImageWidth", 3, 4), new z25(257, "ImageLength", 3, 4), new z25("Make", 271, 2), new z25("Model", 272, 2), new z25("Orientation", 274, 3), new z25("XResolution", 282, 5), new z25("YResolution", 283, 5), new z25("ResolutionUnit", 296, 3), new z25("Software", 305, 2), new z25("DateTime", 306, 2), new z25("YCbCrPositioning", 531, 3), new z25("SubIFDPointer", 330, 4), new z25("ExifIFDPointer", 34665, 4), new z25("GPSInfoIFDPointer", 34853, 4)};
        z25 z25 = r1;
        z25 z252 = new z25("ExposureTime", 33434, 5);
        z25 z253 = r1;
        z25 z254 = new z25("FNumber", 33437, 5);
        z25 z255 = r1;
        z25 z256 = new z25("ExposureProgram", 34850, 3);
        z25 z257 = r1;
        z25 z258 = new z25("PhotographicSensitivity", 34855, 3);
        z25 z259 = r1;
        z25 z2510 = new z25("SensitivityType", 34864, 3);
        z25 z2511 = r1;
        z25 z2512 = new z25("ExifVersion", 36864, 2);
        z25 z2513 = r1;
        z25 z2514 = new z25("DateTimeOriginal", 36867, 2);
        z25 z2515 = r1;
        z25 z2516 = new z25("DateTimeDigitized", 36868, 2);
        z25 z2517 = r1;
        z25 z2518 = new z25("ComponentsConfiguration", 37121, 7);
        z25 z2519 = r1;
        z25 z2520 = new z25("ShutterSpeedValue", 37377, 10);
        z25 z2521 = r1;
        z25 z2522 = new z25("ApertureValue", 37378, 5);
        z25 z2523 = r1;
        z25 z2524 = new z25("BrightnessValue", 37379, 10);
        z25 z2525 = r1;
        z25 z2526 = new z25("ExposureBiasValue", 37380, 10);
        z25 z2527 = r1;
        z25 z2528 = new z25("MaxApertureValue", 37381, 5);
        z25 z2529 = r1;
        z25 z2530 = new z25("MeteringMode", 37383, 3);
        z25 z2531 = r1;
        z25 z2532 = new z25("LightSource", 37384, 3);
        z25 z2533 = r1;
        z25 z2534 = new z25("Flash", 37385, 3);
        z25 z2535 = r1;
        z25 z2536 = new z25("FocalLength", 37386, 5);
        z25 z2537 = r1;
        z25 z2538 = new z25("SubSecTime", 37520, 2);
        z25 z2539 = r1;
        z25 z2540 = new z25("SubSecTimeOriginal", 37521, 2);
        z25 z2541 = r1;
        z25 z2542 = new z25("SubSecTimeDigitized", 37522, 2);
        z25 z2543 = r1;
        z25 z2544 = new z25("FlashpixVersion", 40960, 7);
        z25 z2545 = r1;
        z25 z2546 = new z25("ColorSpace", 40961, 3);
        z25 z2547 = r1;
        z25 z2548 = new z25(40962, "PixelXDimension", 3, 4);
        z25 z2549 = r1;
        z25 z2550 = new z25(40963, "PixelYDimension", 3, 4);
        z25 z2551 = r1;
        z25 z2552 = new z25("InteroperabilityIFDPointer", 40965, 4);
        z25 z2553 = r1;
        z25 z2554 = new z25("FocalPlaneResolutionUnit", 41488, 3);
        z25 z2555 = r1;
        z25 z2556 = new z25("SensingMethod", 41495, 3);
        z25 z2557 = r1;
        z25 z2558 = new z25("FileSource", 41728, 7);
        z25 z2559 = r1;
        z25 z2560 = new z25("SceneType", 41729, 7);
        z25 z2561 = r1;
        z25 z2562 = new z25("CustomRendered", 41985, 3);
        z25 z2563 = r1;
        z25 z2564 = new z25("ExposureMode", 41986, 3);
        z25 z2565 = r1;
        z25 z2566 = new z25("WhiteBalance", 41987, 3);
        z25 z2567 = r1;
        z25 z2568 = new z25("SceneCaptureType", 41990, 3);
        z25 z2569 = r1;
        z25 z2570 = new z25("Contrast", 41992, 3);
        z25 z2571 = r1;
        z25 z2572 = new z25("Saturation", 41993, 3);
        z25 z2573 = r1;
        z25 z2574 = new z25("Sharpness", 41994, 3);
        z25[] z25Arr2 = {z25, z253, z255, z257, z259, z2511, z2513, z2515, z2517, z2519, z2521, z2523, z2525, z2527, z2529, z2531, z2533, z2535, z2537, z2539, z2541, z2543, z2545, z2547, z2549, z2551, z2553, z2555, z2557, z2559, z2561, z2563, z2565, z2567, z2569, z2571, z2573};
        z25 z2575 = new z25("GPSVersionID", 0, 1);
        z25 z2576 = new z25("GPSLatitudeRef", 1, 2);
        z25 z2577 = new z25(2, "GPSLatitude", 5, 10);
        z25 z2578 = new z25("GPSLongitudeRef", 3, 2);
        z25 z2579 = new z25(4, "GPSLongitude", 5, 10);
        z25 z2580 = new z25("GPSAltitudeRef", 5, 1);
        z25 z2581 = new z25("GPSAltitude", 6, 5);
        z25 z2582 = new z25("GPSTimeStamp", 7, 5);
        z25 z2583 = new z25("GPSSpeedRef", 12, 2);
        z25 z2584 = new z25("GPSTrackRef", 14, 2);
        z25[] z25Arr3 = z25Arr;
        z25 z2585 = new z25("GPSImgDirectionRef", 16, 2);
        z25 z2586 = new z25("GPSDestBearingRef", 23, 2);
        c = new z25[]{new z25(str, 330, 4), new z25("ExifIFDPointer", 34665, 4), new z25("GPSInfoIFDPointer", 34853, 4), new z25("InteroperabilityIFDPointer", 40965, 4)};
        d = new z25[][]{z25Arr3, z25Arr2, new z25[]{z2575, z2576, z2577, z2578, z2579, z2580, z2581, z2582, z2583, z2584, z2585, z2586, new z25("GPSDestDistanceRef", 25, 2)}, new z25[]{new z25("InteroperabilityIndex", 1, 2)}};
    }

    public n25(ByteOrder byteOrder, ArrayList arrayList) {
        e07.p("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.b = byteOrder;
        this.a = arrayList;
    }

    public final Map a(int i) {
        e07.l(i, rf0.f(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "), 0, 4);
        return (Map) this.a.get(i);
    }
}
