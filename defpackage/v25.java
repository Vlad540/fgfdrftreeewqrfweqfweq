package defpackage;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: v25  reason: default package */
public final class v25 {
    public static final byte[] A = {79, 76, 89, 77, 80, 0};
    public static final byte[] B = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] C = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] D = {101, 88, 73, 102};
    public static final byte[] E = {73, 72, 68, 82};
    public static final byte[] F = {73, 69, 78, 68};
    public static final byte[] G = {82, 73, 70, 70};
    public static final byte[] H = {87, 69, 66, 80};
    public static final byte[] I = {69, 88, 73, 70};
    public static final byte[] J = {-99, 1, 42};
    public static final byte[] K = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] L = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] M = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] N = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] O = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] P = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] Q = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] R = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final s25 S = new s25("StripOffsets", 273, 3);
    public static final s25[][] T;
    public static final s25[] U;
    public static final HashMap[] V = new HashMap[10];
    public static final HashMap[] W = new HashMap[10];
    public static final HashSet X = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap Y = new HashMap();
    public static final Charset Z;
    public static final byte[] a0;
    public static final byte[] b0;
    public static final Pattern c0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern d0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final Pattern e0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    public static final boolean t = Log.isLoggable("ExifInterface", 3);
    public static final int[] u = {8, 8, 8};
    public static final int[] v = {8};
    public static final byte[] w = {-1, -40, -1};
    public static final byte[] x = {102, 116, 121, 112};
    public static final byte[] y = {109, 105, 102, 49};
    public static final byte[] z = {104, 101, 105, 99};
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        s25 s25 = r15;
        s25 s252 = new s25("NewSubfileType", 254, 4);
        s25 s253 = r15;
        s25 s254 = new s25("SubfileType", 255, 4);
        s25 s255 = r15;
        s25 s256 = new s25(256, "ImageWidth", 3, 4);
        s25 s257 = r2;
        s25 s258 = new s25(257, "ImageLength", 3, 4);
        s25 s259 = r2;
        s25 s2510 = new s25("BitsPerSample", 258, 3);
        s25 s2511 = r2;
        s25 s2512 = new s25("Compression", 259, 3);
        s25 s2513 = r2;
        s25 s2514 = new s25("PhotometricInterpretation", 262, 3);
        s25 s2515 = r2;
        s25 s2516 = new s25("ImageDescription", 270, 2);
        s25 s2517 = r2;
        s25 s2518 = new s25("Make", 271, 2);
        s25 s2519 = r2;
        s25 s2520 = new s25("Model", 272, 2);
        s25 s2521 = r2;
        s25 s2522 = new s25(273, "StripOffsets", 3, 4);
        s25 s2523 = r1;
        s25 s2524 = new s25("Orientation", 274, 3);
        s25 s2525 = r1;
        s25 s2526 = new s25("SamplesPerPixel", 277, 3);
        s25 s2527 = r1;
        s25 s2528 = new s25(278, "RowsPerStrip", 3, 4);
        s25 s2529 = r1;
        s25 s2530 = new s25(279, "StripByteCounts", 3, 4);
        s25 s2531 = r1;
        s25 s2532 = new s25("XResolution", 282, 5);
        s25 s2533 = r1;
        s25 s2534 = new s25("YResolution", 283, 5);
        s25 s2535 = r1;
        s25 s2536 = new s25("PlanarConfiguration", 284, 3);
        s25 s2537 = r1;
        s25 s2538 = new s25("ResolutionUnit", 296, 3);
        s25 s2539 = r1;
        s25 s2540 = new s25("TransferFunction", 301, 3);
        s25 s2541 = r1;
        s25 s2542 = new s25("Software", 305, 2);
        s25 s2543 = r1;
        s25 s2544 = new s25("DateTime", 306, 2);
        s25 s2545 = r1;
        s25 s2546 = new s25("Artist", 315, 2);
        s25 s2547 = r1;
        s25 s2548 = new s25("WhitePoint", 318, 5);
        s25 s2549 = r1;
        s25 s2550 = new s25("PrimaryChromaticities", 319, 5);
        s25 s2551 = r1;
        s25 s2552 = new s25("SubIFDPointer", 330, 4);
        s25 s2553 = r1;
        s25 s2554 = new s25("JPEGInterchangeFormat", 513, 4);
        s25 s2555 = r1;
        s25 s2556 = new s25("JPEGInterchangeFormatLength", 514, 4);
        s25 s2557 = r1;
        s25 s2558 = new s25("YCbCrCoefficients", 529, 5);
        s25 s2559 = r1;
        s25 s2560 = new s25("YCbCrSubSampling", 530, 3);
        s25 s2561 = r1;
        s25 s2562 = new s25("YCbCrPositioning", 531, 3);
        s25 s2563 = r1;
        s25 s2564 = new s25("ReferenceBlackWhite", 532, 5);
        s25 s2565 = r1;
        s25 s2566 = new s25("Copyright", 33432, 2);
        s25 s2567 = r1;
        s25 s2568 = new s25("ExifIFDPointer", 34665, 4);
        s25 s2569 = r1;
        s25 s2570 = new s25("GPSInfoIFDPointer", 34853, 4);
        s25 s2571 = r1;
        s25 s2572 = new s25("SensorTopBorder", 4, 4);
        s25 s2573 = r1;
        s25 s2574 = new s25("SensorLeftBorder", 5, 4);
        s25 s2575 = r1;
        s25 s2576 = new s25("SensorBottomBorder", 6, 4);
        s25 s2577 = r1;
        s25 s2578 = new s25("SensorRightBorder", 7, 4);
        s25 s2579 = r1;
        s25 s2580 = new s25("ISO", 23, 3);
        s25 s2581 = r1;
        s25 s2582 = new s25("JpgFromRaw", 46, 7);
        s25 s2583 = r1;
        s25 s2584 = new s25("Xmp", 700, 1);
        s25[] s25Arr = {s25, s253, s255, s257, s259, s2511, s2513, s2515, s2517, s2519, s2521, s2523, s2525, s2527, s2529, s2531, s2533, s2535, s2537, s2539, s2541, s2543, s2545, s2547, s2549, s2551, s2553, s2555, s2557, s2559, s2561, s2563, s2565, s2567, s2569, s2571, s2573, s2575, s2577, s2579, s2581, s2583};
        s25 s2585 = r1;
        s25 s2586 = new s25("ExposureTime", 33434, 5);
        s25 s2587 = r1;
        s25 s2588 = new s25("FNumber", 33437, 5);
        s25 s2589 = r1;
        s25 s2590 = new s25("ExposureProgram", 34850, 3);
        s25 s2591 = r1;
        s25 s2592 = new s25("SpectralSensitivity", 34852, 2);
        s25 s2593 = r1;
        s25 s2594 = new s25("PhotographicSensitivity", 34855, 3);
        s25 s2595 = r1;
        s25 s2596 = new s25("OECF", 34856, 7);
        s25 s2597 = r1;
        s25 s2598 = new s25("SensitivityType", 34864, 3);
        s25 s2599 = r1;
        s25 s25100 = new s25("StandardOutputSensitivity", 34865, 4);
        s25 s25101 = r1;
        s25 s25102 = new s25("RecommendedExposureIndex", 34866, 4);
        s25 s25103 = r1;
        s25 s25104 = new s25("ISOSpeed", 34867, 4);
        s25 s25105 = r1;
        s25 s25106 = new s25("ISOSpeedLatitudeyyy", 34868, 4);
        s25 s25107 = r1;
        s25 s25108 = new s25("ISOSpeedLatitudezzz", 34869, 4);
        s25 s25109 = r1;
        s25 s25110 = new s25("ExifVersion", 36864, 2);
        s25 s25111 = r1;
        s25 s25112 = new s25("DateTimeOriginal", 36867, 2);
        s25 s25113 = r1;
        s25 s25114 = new s25("DateTimeDigitized", 36868, 2);
        s25 s25115 = r1;
        s25 s25116 = new s25("OffsetTime", 36880, 2);
        s25 s25117 = r1;
        s25 s25118 = new s25("OffsetTimeOriginal", 36881, 2);
        s25 s25119 = r1;
        s25 s25120 = new s25("OffsetTimeDigitized", 36882, 2);
        s25 s25121 = r1;
        s25 s25122 = new s25("ComponentsConfiguration", 37121, 7);
        s25 s25123 = r1;
        s25 s25124 = new s25("CompressedBitsPerPixel", 37122, 5);
        s25 s25125 = r1;
        s25 s25126 = new s25("ShutterSpeedValue", 37377, 10);
        s25 s25127 = r1;
        s25 s25128 = new s25("ApertureValue", 37378, 5);
        s25 s25129 = r1;
        s25 s25130 = new s25("BrightnessValue", 37379, 10);
        s25 s25131 = r1;
        s25 s25132 = new s25("ExposureBiasValue", 37380, 10);
        s25 s25133 = r1;
        s25 s25134 = new s25("MaxApertureValue", 37381, 5);
        s25 s25135 = r1;
        s25 s25136 = new s25("SubjectDistance", 37382, 5);
        s25 s25137 = r1;
        s25 s25138 = new s25("MeteringMode", 37383, 3);
        s25 s25139 = r1;
        s25 s25140 = new s25("LightSource", 37384, 3);
        s25 s25141 = r1;
        s25 s25142 = new s25("Flash", 37385, 3);
        s25 s25143 = r1;
        s25 s25144 = new s25("FocalLength", 37386, 5);
        s25 s25145 = r1;
        s25 s25146 = new s25("SubjectArea", 37396, 3);
        s25 s25147 = r1;
        s25 s25148 = new s25("MakerNote", 37500, 7);
        s25 s25149 = r1;
        s25 s25150 = new s25("UserComment", 37510, 7);
        s25 s25151 = r1;
        s25 s25152 = new s25("SubSecTime", 37520, 2);
        s25 s25153 = r1;
        s25 s25154 = new s25("SubSecTimeOriginal", 37521, 2);
        s25 s25155 = r1;
        s25 s25156 = new s25("SubSecTimeDigitized", 37522, 2);
        s25 s25157 = r1;
        s25 s25158 = new s25("FlashpixVersion", 40960, 7);
        s25 s25159 = r1;
        s25 s25160 = new s25("ColorSpace", 40961, 3);
        s25 s25161 = r1;
        s25 s25162 = new s25(40962, "PixelXDimension", 3, 4);
        s25 s25163 = r1;
        s25 s25164 = new s25(40963, "PixelYDimension", 3, 4);
        s25 s25165 = r1;
        s25 s25166 = new s25("RelatedSoundFile", 40964, 2);
        s25 s25167 = r1;
        s25 s25168 = new s25("InteroperabilityIFDPointer", 40965, 4);
        s25 s25169 = r1;
        s25 s25170 = new s25("FlashEnergy", 41483, 5);
        s25 s25171 = r1;
        s25 s25172 = new s25("SpatialFrequencyResponse", 41484, 7);
        s25 s25173 = r1;
        s25 s25174 = new s25("FocalPlaneXResolution", 41486, 5);
        s25 s25175 = r1;
        s25 s25176 = new s25("FocalPlaneYResolution", 41487, 5);
        s25 s25177 = r1;
        s25 s25178 = new s25("FocalPlaneResolutionUnit", 41488, 3);
        s25 s25179 = r1;
        s25 s25180 = new s25("SubjectLocation", 41492, 3);
        s25 s25181 = r1;
        s25 s25182 = new s25("ExposureIndex", 41493, 5);
        s25 s25183 = r1;
        s25 s25184 = new s25("SensingMethod", 41495, 3);
        s25 s25185 = r1;
        s25 s25186 = new s25("FileSource", 41728, 7);
        s25 s25187 = r1;
        s25 s25188 = new s25("SceneType", 41729, 7);
        s25 s25189 = r1;
        s25 s25190 = new s25("CFAPattern", 41730, 7);
        s25 s25191 = r1;
        s25 s25192 = new s25("CustomRendered", 41985, 3);
        s25 s25193 = r1;
        s25 s25194 = new s25("ExposureMode", 41986, 3);
        s25 s25195 = r1;
        s25 s25196 = new s25("WhiteBalance", 41987, 3);
        s25 s25197 = r1;
        s25 s25198 = new s25("DigitalZoomRatio", 41988, 5);
        s25 s25199 = r1;
        s25 s25200 = new s25("FocalLengthIn35mmFilm", 41989, 3);
        s25 s25201 = r1;
        s25 s25202 = new s25("SceneCaptureType", 41990, 3);
        s25 s25203 = r1;
        s25 s25204 = new s25("GainControl", 41991, 3);
        s25 s25205 = r1;
        s25 s25206 = new s25("Contrast", 41992, 3);
        s25 s25207 = r1;
        s25 s25208 = new s25("Saturation", 41993, 3);
        s25 s25209 = r1;
        s25 s25210 = new s25("Sharpness", 41994, 3);
        s25 s25211 = r1;
        s25 s25212 = new s25("DeviceSettingDescription", 41995, 7);
        s25 s25213 = r1;
        s25 s25214 = new s25("SubjectDistanceRange", 41996, 3);
        s25 s25215 = r1;
        s25 s25216 = new s25("ImageUniqueID", 42016, 2);
        s25 s25217 = r1;
        s25 s25218 = new s25("CameraOwnerName", 42032, 2);
        s25 s25219 = r1;
        s25 s25220 = new s25("BodySerialNumber", 42033, 2);
        s25 s25221 = r1;
        s25 s25222 = new s25("LensSpecification", 42034, 5);
        s25 s25223 = r1;
        s25 s25224 = new s25("LensMake", 42035, 2);
        s25 s25225 = r1;
        s25 s25226 = new s25("LensModel", 42036, 2);
        s25 s25227 = r1;
        s25 s25228 = new s25("Gamma", 42240, 5);
        s25 s25229 = r1;
        s25 s25230 = new s25("DNGVersion", 50706, 1);
        s25 s25231 = r1;
        s25 s25232 = new s25(50720, "DefaultCropSize", 3, 4);
        s25 s25233 = r1;
        s25 s25234 = new s25("GPSVersionID", 0, 1);
        s25 s25235 = r1;
        s25 s25236 = new s25("GPSLatitudeRef", 1, 2);
        s25 s25237 = r1;
        s25 s25238 = new s25(2, "GPSLatitude", 5, 10);
        s25 s25239 = r1;
        s25 s25240 = new s25("GPSLongitudeRef", 3, 2);
        s25 s25241 = r1;
        s25 s25242 = new s25(4, "GPSLongitude", 5, 10);
        s25 s25243 = r1;
        s25 s25244 = new s25("GPSAltitudeRef", 5, 1);
        s25 s25245 = r1;
        s25 s25246 = new s25("GPSAltitude", 6, 5);
        s25 s25247 = r1;
        s25 s25248 = new s25("GPSTimeStamp", 7, 5);
        s25 s25249 = r1;
        s25 s25250 = new s25("GPSSatellites", 8, 2);
        s25 s25251 = r1;
        s25 s25252 = new s25("GPSStatus", 9, 2);
        s25 s25253 = r1;
        s25 s25254 = new s25("GPSMeasureMode", 10, 2);
        s25 s25255 = r1;
        s25 s25256 = new s25("GPSDOP", 11, 5);
        s25 s25257 = r1;
        s25 s25258 = new s25("GPSSpeedRef", 12, 2);
        s25 s25259 = r1;
        s25 s25260 = new s25("GPSSpeed", 13, 5);
        s25 s25261 = r1;
        s25 s25262 = new s25("GPSTrackRef", 14, 2);
        s25 s25263 = r1;
        s25 s25264 = new s25("GPSTrack", 15, 5);
        s25 s25265 = r1;
        s25 s25266 = new s25("GPSImgDirectionRef", 16, 2);
        s25 s25267 = r1;
        s25 s25268 = new s25("GPSImgDirection", 17, 5);
        s25 s25269 = r1;
        s25 s25270 = new s25("GPSMapDatum", 18, 2);
        s25 s25271 = r1;
        s25 s25272 = new s25("GPSDestLatitudeRef", 19, 2);
        s25 s25273 = r1;
        s25 s25274 = new s25("GPSDestLatitude", 20, 5);
        s25 s25275 = r1;
        s25 s25276 = new s25("GPSDestLongitudeRef", 21, 2);
        s25 s25277 = r1;
        s25 s25278 = new s25("GPSDestLongitude", 22, 5);
        s25 s25279 = r1;
        s25 s25280 = new s25("GPSDestBearingRef", 23, 2);
        s25 s25281 = r1;
        s25 s25282 = new s25("GPSDestBearing", 24, 5);
        s25 s25283 = r1;
        s25 s25284 = new s25("GPSDestDistanceRef", 25, 2);
        s25 s25285 = r1;
        s25 s25286 = new s25("GPSDestDistance", 26, 5);
        s25 s25287 = r1;
        s25 s25288 = new s25("GPSProcessingMethod", 27, 7);
        s25 s25289 = r1;
        s25 s25290 = new s25("GPSAreaInformation", 28, 7);
        s25 s25291 = r1;
        s25 s25292 = new s25("GPSDateStamp", 29, 2);
        s25 s25293 = r1;
        s25 s25294 = new s25("GPSDifferential", 30, 3);
        s25 s25295 = r1;
        s25 s25296 = new s25("GPSHPositioningError", 31, 5);
        s25[] s25Arr2 = {s25233, s25235, s25237, s25239, s25241, s25243, s25245, s25247, s25249, s25251, s25253, s25255, s25257, s25259, s25261, s25263, s25265, s25267, s25269, s25271, s25273, s25275, s25277, s25279, s25281, s25283, s25285, s25287, s25289, s25291, s25293, s25295};
        s25[] s25Arr3 = {new s25("InteroperabilityIndex", 1, 2)};
        s25 s25297 = r1;
        s25 s25298 = new s25("NewSubfileType", 254, 4);
        s25 s25299 = r1;
        s25 s25300 = new s25("SubfileType", 255, 4);
        s25 s25301 = r1;
        s25 s25302 = new s25(256, "ThumbnailImageWidth", 3, 4);
        s25 s25303 = r1;
        s25 s25304 = new s25(257, "ThumbnailImageLength", 3, 4);
        s25 s25305 = r1;
        s25 s25306 = new s25("BitsPerSample", 258, 3);
        s25 s25307 = r1;
        s25 s25308 = new s25("Compression", 259, 3);
        s25 s25309 = r1;
        s25 s25310 = new s25("PhotometricInterpretation", 262, 3);
        s25 s25311 = r1;
        s25 s25312 = new s25("ImageDescription", 270, 2);
        s25 s25313 = r1;
        s25 s25314 = new s25("Make", 271, 2);
        s25 s25315 = r0;
        s25 s25316 = new s25("Model", 272, 2);
        s25 s25317 = r0;
        s25 s25318 = new s25(273, "StripOffsets", 3, 4);
        s25 s25319 = r0;
        s25 s25320 = new s25("ThumbnailOrientation", 274, 3);
        s25 s25321 = r0;
        s25 s25322 = new s25("SamplesPerPixel", 277, 3);
        s25 s25323 = r0;
        s25 s25324 = new s25(278, "RowsPerStrip", 3, 4);
        s25 s25325 = r0;
        s25 s25326 = new s25(279, "StripByteCounts", 3, 4);
        s25 s25327 = r0;
        s25 s25328 = new s25("XResolution", 282, 5);
        s25 s25329 = r0;
        s25 s25330 = new s25("YResolution", 283, 5);
        s25 s25331 = r0;
        s25 s25332 = new s25("PlanarConfiguration", 284, 3);
        s25 s25333 = r0;
        s25 s25334 = new s25("ResolutionUnit", 296, 3);
        s25 s25335 = r0;
        s25 s25336 = new s25("TransferFunction", 301, 3);
        s25 s25337 = r0;
        s25 s25338 = new s25("Software", 305, 2);
        s25 s25339 = r0;
        s25 s25340 = new s25("DateTime", 306, 2);
        s25 s25341 = r0;
        s25 s25342 = new s25("Artist", 315, 2);
        s25 s25343 = r0;
        s25 s25344 = new s25("WhitePoint", 318, 5);
        s25 s25345 = r0;
        s25 s25346 = new s25("PrimaryChromaticities", 319, 5);
        s25 s25347 = r0;
        s25 s25348 = new s25("SubIFDPointer", 330, 4);
        s25 s25349 = r0;
        s25 s25350 = new s25("JPEGInterchangeFormat", 513, 4);
        s25 s25351 = r0;
        s25 s25352 = new s25("JPEGInterchangeFormatLength", 514, 4);
        s25 s25353 = r0;
        s25 s25354 = new s25("YCbCrCoefficients", 529, 5);
        s25 s25355 = r0;
        s25 s25356 = new s25("YCbCrSubSampling", 530, 3);
        s25 s25357 = r0;
        s25 s25358 = new s25("YCbCrPositioning", 531, 3);
        s25 s25359 = r0;
        s25 s25360 = new s25("ReferenceBlackWhite", 532, 5);
        s25 s25361 = r0;
        s25 s25362 = new s25("Copyright", 33432, 2);
        s25 s25363 = r0;
        s25 s25364 = new s25("ExifIFDPointer", 34665, 4);
        s25 s25365 = r0;
        String str = "GPSInfoIFDPointer";
        s25 s25366 = new s25(str, 34853, 4);
        s25 s25367 = r0;
        s25 s25368 = new s25("DNGVersion", 50706, 1);
        s25 s25369 = r0;
        s25 s25370 = new s25(50720, "DefaultCropSize", 3, 4);
        T = new s25[][]{s25Arr, new s25[]{s2585, s2587, s2589, s2591, s2593, s2595, s2597, s2599, s25101, s25103, s25105, s25107, s25109, s25111, s25113, s25115, s25117, s25119, s25121, s25123, s25125, s25127, s25129, s25131, s25133, s25135, s25137, s25139, s25141, s25143, s25145, s25147, s25149, s25151, s25153, s25155, s25157, s25159, s25161, s25163, s25165, s25167, s25169, s25171, s25173, s25175, s25177, s25179, s25181, s25183, s25185, s25187, s25189, s25191, s25193, s25195, s25197, s25199, s25201, s25203, s25205, s25207, s25209, s25211, s25213, s25215, s25217, s25219, s25221, s25223, s25225, s25227, s25229, s25231}, s25Arr2, s25Arr3, new s25[]{s25297, s25299, s25301, s25303, s25305, s25307, s25309, s25311, s25313, s25315, s25317, s25319, s25321, s25323, s25325, s25327, s25329, s25331, s25333, s25335, s25337, s25339, s25341, s25343, s25345, s25347, s25349, s25351, s25353, s25355, s25357, s25359, s25361, s25363, s25365, s25367, s25369}, s25Arr, new s25[]{new s25("ThumbnailImage", 256, 7), new s25("CameraSettingsIFDPointer", 8224, 4), new s25("ImageProcessingIFDPointer", 8256, 4)}, new s25[]{new s25("PreviewImageStart", 257, 4), new s25("PreviewImageLength", 258, 4)}, new s25[]{new s25("AspectFrame", 4371, 3)}, new s25[]{new s25("ColorSpace", 55, 3)}};
        U = new s25[]{new s25("SubIFDPointer", 330, 4), new s25("ExifIFDPointer", 34665, 4), new s25(str, 34853, 4), new s25("InteroperabilityIFDPointer", 40965, 4), new s25("CameraSettingsIFDPointer", 8224, 1), new s25("ImageProcessingIFDPointer", 8256, 1)};
        Charset forName = Charset.forName("US-ASCII");
        Z = forName;
        a0 = "Exif\u0000\u0000".getBytes(forName);
        b0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            s25[][] s25Arr4 = T;
            if (i2 < s25Arr4.length) {
                V[i2] = new HashMap();
                W[i2] = new HashMap();
                for (s25 s25371 : s25Arr4[i2]) {
                    V[i2].put(Integer.valueOf(s25371.a), s25371);
                    W[i2].put(s25371.b, s25371);
                }
                i2++;
            } else {
                HashMap hashMap = Y;
                s25[] s25Arr5 = U;
                hashMap.put(Integer.valueOf(s25Arr5[0].a), 5);
                hashMap.put(Integer.valueOf(s25Arr5[1].a), 1);
                hashMap.put(Integer.valueOf(s25Arr5[2].a), 2);
                hashMap.put(Integer.valueOf(s25Arr5[3].a), 3);
                hashMap.put(Integer.valueOf(s25Arr5[4].a), 7);
                hashMap.put(Integer.valueOf(s25Arr5[5].a), 8);
                Pattern.compile(".*[1-9].*");
                return;
            }
        }
    }

    public v25(String str) {
        boolean z2;
        s25[][] s25Arr = T;
        this.e = new HashMap[s25Arr.length];
        this.f = new HashSet(s25Arr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.c = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        w25.c(fileInputStream2.getFD(), 0, OsConstants.SEEK_CUR);
                        z2 = true;
                    } catch (Exception unused) {
                        z2 = false;
                    }
                    if (z2) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    t(fileInputStream2);
                    pfa.e(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    pfa.e(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                pfa.e(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    public static double b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble2 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + parseDouble;
            if (!str2.equals("S")) {
                if (!str2.equals("W")) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble2;
                }
            }
            return -parseDouble2;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(q25 q25, ou0 ou0, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (q25.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = Z;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? BuildConfig.FLAVOR : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int readInt = q25.readInt();
            ou0.write(bArr3);
            ou0.d(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            pfa.h(q25, ou0, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        java.lang.Double.parseDouble(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        return new android.util.Pair(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
        return new android.util.Pair(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair q(java.lang.String r10) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r10.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r10 = r10.split(r0, r6)
            r0 = r10[r2]
            android.util.Pair r0 = q(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r10.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r10[r3]
            android.util.Pair r1 = q(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r10.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r10 = r10.split(r0, r6)
            int r0 = r10.length
            if (r0 != r4) goto L_0x00ff
            r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r10 < 0) goto L_0x00f5
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r10 > 0) goto L_0x00eb
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00eb:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00f5:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00ff:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r3 = 4
            if (r2 < 0) goto L_0x0124
            r8 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0124
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0124:
            if (r2 >= 0) goto L_0x0132
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0132:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x013c:
            java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
            return r10
        L_0x014b:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.q(java.lang.String):android.util.Pair");
    }

    public static ByteOrder w(q25 q25) {
        short readShort = q25.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public final void A(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.e;
        if (!hashMapArr[i2].isEmpty() && hashMapArr[i2].get(str) != null) {
            HashMap hashMap = hashMapArr[i2];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i2].remove(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r9v8, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009c, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ea, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00eb, code lost:
        r11 = null;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ed, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ee, code lost:
        r10 = null;
        r11 = null;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00fa, code lost:
        defpackage.w25.c(r14.b, 0, android.system.OsConstants.SEEK_SET);
        r4 = new java.io.FileOutputStream(r14.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0110, code lost:
        r4 = new java.io.FileOutputStream(r14.a);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c A[Catch:{ Exception -> 0x00a0, all -> 0x009c }, ExcHandler: all (th java.lang.Throwable), Splitter:B:41:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fa A[Catch:{ Exception -> 0x010d, all -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0110 A[Catch:{ Exception -> 0x010d, all -> 0x010a }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B() {
        /*
            r14 = this;
            java.lang.String r0 = "Failed to save new file. Original file is stored in "
            int r1 = r14.d
            r2 = 14
            r3 = 13
            r4 = 4
            if (r1 == r4) goto L_0x0018
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."
            r14.<init>(r0)
            throw r14
        L_0x0018:
            java.io.FileDescriptor r1 = r14.b
            if (r1 != 0) goto L_0x0029
            java.lang.String r1 = r14.a
            if (r1 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "ExifInterface does not support saving attributes for the current input."
            r14.<init>(r0)
            throw r14
        L_0x0029:
            boolean r1 = r14.h
            if (r1 == 0) goto L_0x003e
            boolean r1 = r14.i
            if (r1 == 0) goto L_0x003e
            boolean r1 = r14.j
            if (r1 == 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r0 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r14.<init>(r0)
            throw r14
        L_0x003e:
            int r1 = r14.n
            r5 = 6
            r6 = 0
            if (r1 == r5) goto L_0x004a
            r5 = 7
            if (r1 != r5) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r1 = r6
            goto L_0x004e
        L_0x004a:
            byte[] r1 = r14.o()
        L_0x004e:
            r14.m = r1
            java.lang.String r1 = "temp"
            java.lang.String r5 = "tmp"
            java.io.File r1 = java.io.File.createTempFile(r1, r5)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.lang.String r5 = r14.a     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r7 = 0
            if (r5 == 0) goto L_0x006e
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.lang.String r9 = r14.a     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            goto L_0x007c
        L_0x0066:
            r14 = move-exception
            r9 = r6
            goto L_0x016b
        L_0x006a:
            r14 = move-exception
            r9 = r6
            goto L_0x0162
        L_0x006e:
            java.io.FileDescriptor r5 = r14.b     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            int r9 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            defpackage.w25.c(r5, r7, r9)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            java.io.FileDescriptor r9 = r14.b     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x006a, all -> 0x0066 }
        L_0x007c:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            defpackage.pfa.i(r5, r9)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            defpackage.pfa.e(r5)
            defpackage.pfa.e(r9)
            r5 = 0
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00ed, all -> 0x009c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x00ed, all -> 0x009c }
            java.lang.String r10 = r14.a     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            if (r10 == 0) goto L_0x00a6
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.lang.String r11 = r14.a     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            goto L_0x00b4
        L_0x009c:
            r14 = move-exception
            r12 = r6
            goto L_0x014a
        L_0x00a0:
            r2 = move-exception
            r10 = r6
            r11 = r10
        L_0x00a3:
            r12 = r11
        L_0x00a4:
            r6 = r9
            goto L_0x00f1
        L_0x00a6:
            java.io.FileDescriptor r10 = r14.b     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            int r11 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            defpackage.w25.c(r10, r7, r11)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            java.io.FileDescriptor r11 = r14.b     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00a0, all -> 0x009c }
        L_0x00b4:
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00ea, all -> 0x009c }
            r11.<init>(r9)     // Catch:{ Exception -> 0x00ea, all -> 0x009c }
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00e7, all -> 0x00e4 }
            r12.<init>(r10)     // Catch:{ Exception -> 0x00e7, all -> 0x00e4 }
            int r13 = r14.d     // Catch:{ Exception -> 0x00e2 }
            if (r13 != r4) goto L_0x00c9
            r14.C(r11, r12)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00d4
        L_0x00c6:
            r6 = r11
            goto L_0x014a
        L_0x00c9:
            if (r13 != r3) goto L_0x00cf
            r14.D(r11, r12)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x00d4
        L_0x00cf:
            if (r13 != r2) goto L_0x00d4
            r14.E(r11, r12)     // Catch:{ Exception -> 0x00e2 }
        L_0x00d4:
            defpackage.pfa.e(r11)
            defpackage.pfa.e(r12)
            r1.delete()
            r14.m = r6
            return
        L_0x00e0:
            r14 = move-exception
            goto L_0x00c6
        L_0x00e2:
            r2 = move-exception
            goto L_0x00a4
        L_0x00e4:
            r14 = move-exception
            r12 = r6
            goto L_0x00c6
        L_0x00e7:
            r2 = move-exception
            r12 = r6
            goto L_0x00a4
        L_0x00ea:
            r2 = move-exception
            r11 = r6
            goto L_0x00a3
        L_0x00ed:
            r2 = move-exception
            r10 = r6
            r11 = r10
            r12 = r11
        L_0x00f1:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x012b }
            r3.<init>(r1)     // Catch:{ Exception -> 0x012b }
            java.lang.String r4 = r14.a     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            if (r4 != 0) goto L_0x0110
            java.io.FileDescriptor r4 = r14.b     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            defpackage.w25.c(r4, r7, r6)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            java.io.FileDescriptor r14 = r14.b     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            r4.<init>(r14)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
        L_0x0108:
            r10 = r4
            goto L_0x0118
        L_0x010a:
            r14 = move-exception
            r6 = r3
            goto L_0x0143
        L_0x010d:
            r14 = move-exception
            r6 = r3
            goto L_0x012c
        L_0x0110:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            java.lang.String r14 = r14.a     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            r4.<init>(r14)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            goto L_0x0108
        L_0x0118:
            defpackage.pfa.i(r3, r10)     // Catch:{ Exception -> 0x010d, all -> 0x010a }
            defpackage.pfa.e(r3)     // Catch:{ all -> 0x00e0 }
            defpackage.pfa.e(r10)     // Catch:{ all -> 0x00e0 }
            java.io.IOException r14 = new java.io.IOException     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "Failed to save new file"
            r14.<init>(r0, r2)     // Catch:{ all -> 0x00e0 }
            throw r14     // Catch:{ all -> 0x00e0 }
        L_0x0129:
            r14 = move-exception
            goto L_0x0143
        L_0x012b:
            r14 = move-exception
        L_0x012c:
            r5 = 1
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0129 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0129 }
            r3.<init>(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x0129 }
            r3.append(r0)     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0129 }
            r2.<init>(r0, r14)     // Catch:{ all -> 0x0129 }
            throw r2     // Catch:{ all -> 0x0129 }
        L_0x0143:
            defpackage.pfa.e(r6)     // Catch:{ all -> 0x00e0 }
            defpackage.pfa.e(r10)     // Catch:{ all -> 0x00e0 }
            throw r14     // Catch:{ all -> 0x00e0 }
        L_0x014a:
            defpackage.pfa.e(r6)
            defpackage.pfa.e(r12)
            if (r5 != 0) goto L_0x0155
            r1.delete()
        L_0x0155:
            throw r14
        L_0x0156:
            r14 = move-exception
        L_0x0157:
            r6 = r5
            goto L_0x016b
        L_0x0159:
            r14 = move-exception
        L_0x015a:
            r6 = r5
            goto L_0x0162
        L_0x015c:
            r14 = move-exception
            r9 = r6
            goto L_0x0157
        L_0x015f:
            r14 = move-exception
            r9 = r6
            goto L_0x015a
        L_0x0162:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x016a }
            java.lang.String r1 = "Failed to copy original file to temp file"
            r0.<init>(r1, r14)     // Catch:{ all -> 0x016a }
            throw r0     // Catch:{ all -> 0x016a }
        L_0x016a:
            r14 = move-exception
        L_0x016b:
            defpackage.pfa.e(r6)
            defpackage.pfa.e(r9)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.B():void");
    }

    public final void C(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        q25 q25 = new q25((InputStream) bufferedInputStream);
        ou0 ou0 = new ou0(bufferedOutputStream, ByteOrder.BIG_ENDIAN, 1);
        if (q25.readByte() == -1) {
            ou0.a(-1);
            if (q25.readByte() == -40) {
                ou0.a(-40);
                String d2 = d("Xmp");
                HashMap[] hashMapArr = this.e;
                r25 r25 = (d2 == null || !this.s) ? null : (r25) hashMapArr[0].remove("Xmp");
                ou0.a(-1);
                ou0.a(-31);
                K(ou0);
                if (r25 != null) {
                    hashMapArr[0].put("Xmp", r25);
                }
                byte[] bArr = new byte[4096];
                while (q25.readByte() == -1) {
                    byte readByte = q25.readByte();
                    if (readByte == -39 || readByte == -38) {
                        ou0.a(-1);
                        ou0.a(readByte);
                        pfa.i(q25, ou0);
                        return;
                    } else if (readByte != -31) {
                        ou0.a(-1);
                        ou0.a(readByte);
                        int readUnsignedShort = q25.readUnsignedShort();
                        ou0.g((short) readUnsignedShort);
                        int i2 = readUnsignedShort - 2;
                        if (i2 >= 0) {
                            while (i2 > 0) {
                                int read = q25.read(bArr, 0, Math.min(i2, 4096));
                                if (read < 0) {
                                    break;
                                }
                                ou0.write(bArr, 0, read);
                                i2 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = q25.readUnsignedShort();
                        int i3 = readUnsignedShort2 - 2;
                        if (i3 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (i3 >= 6) {
                                if (q25.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, a0)) {
                                    q25.a(readUnsignedShort2 - 8);
                                }
                            }
                            ou0.a(-1);
                            ou0.a(readByte);
                            ou0.g((short) readUnsignedShort2);
                            if (i3 >= 6) {
                                i3 = readUnsignedShort2 - 8;
                                ou0.write(bArr2);
                            }
                            while (i3 > 0) {
                                int read2 = q25.read(bArr, 0, Math.min(i3, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                ou0.write(bArr, 0, read2);
                                i3 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        q25 q25 = new q25((InputStream) bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        ou0 ou0 = new ou0(bufferedOutputStream, byteOrder, 1);
        byte[] bArr = C;
        pfa.h(q25, ou0, bArr.length);
        int i2 = this.o;
        if (i2 == 0) {
            int readInt = q25.readInt();
            ou0.d(readInt);
            pfa.h(q25, ou0, readInt + 8);
        } else {
            pfa.h(q25, ou0, (i2 - bArr.length) - 8);
            q25.a(q25.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                ou0 ou02 = new ou0(byteArrayOutputStream2, byteOrder, 1);
                K(ou02);
                byte[] byteArray = ((ByteArrayOutputStream) ou02.b).toByteArray();
                ou0.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                ou0.d((int) crc32.getValue());
                pfa.e(byteArrayOutputStream2);
                pfa.i(q25, ou0);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                pfa.e(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            pfa.e(byteArrayOutputStream);
            throw th;
        }
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        ou0 ou0;
        byte[] bArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        BufferedInputStream bufferedInputStream2 = bufferedInputStream;
        if (t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        q25 q25 = new q25(bufferedInputStream2, byteOrder);
        ou0 ou02 = new ou0(bufferedOutputStream, byteOrder, 1);
        byte[] bArr2 = G;
        pfa.h(q25, ou02, bArr2.length);
        byte[] bArr3 = H;
        q25.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                ou0 ou03 = new ou0(byteArrayOutputStream2, byteOrder, 1);
                int i5 = this.o;
                if (i5 != 0) {
                    pfa.h(q25, ou03, (i5 - ((bArr2.length + 4) + bArr3.length)) - 8);
                    q25.a(4);
                    int readInt = q25.readInt();
                    if (readInt % 2 != 0) {
                        readInt++;
                    }
                    q25.a(readInt);
                    K(ou03);
                } else {
                    byte[] bArr4 = new byte[4];
                    if (q25.read(bArr4) == 4) {
                        byte[] bArr5 = K;
                        boolean equals = Arrays.equals(bArr4, bArr5);
                        byte[] bArr6 = M;
                        byte[] bArr7 = L;
                        boolean z3 = false;
                        if (equals) {
                            int readInt2 = q25.readInt();
                            byte[] bArr8 = new byte[(readInt2 % 2 == 1 ? readInt2 + 1 : readInt2)];
                            q25.read(bArr8);
                            byte b2 = (byte) (bArr8[0] | 8);
                            bArr8[0] = b2;
                            if (((b2 >> 1) & 1) == 1) {
                                z3 = true;
                            }
                            ou03.write(bArr5);
                            ou03.d(readInt2);
                            ou03.write(bArr8);
                            if (z3) {
                                c(q25, ou03, N, (byte[]) null);
                                while (true) {
                                    byte[] bArr9 = new byte[4];
                                    bufferedInputStream2.read(bArr9);
                                    if (!Arrays.equals(bArr9, O)) {
                                        break;
                                    }
                                    int readInt3 = q25.readInt();
                                    ou03.write(bArr9);
                                    ou03.d(readInt3);
                                    if (readInt3 % 2 == 1) {
                                        readInt3++;
                                    }
                                    pfa.h(q25, ou03, readInt3);
                                }
                                K(ou03);
                            } else {
                                c(q25, ou03, bArr6, bArr7);
                                K(ou03);
                            }
                        } else if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                            int readInt4 = q25.readInt();
                            int i6 = readInt4 % 2 == 1 ? readInt4 + 1 : readInt4;
                            byte[] bArr10 = new byte[3];
                            boolean equals2 = Arrays.equals(bArr4, bArr6);
                            byte[] bArr11 = J;
                            if (equals2) {
                                q25.read(bArr10);
                                byte[] bArr12 = new byte[3];
                                ou0 = ou02;
                                if (q25.read(bArr12) != 3 || !Arrays.equals(bArr11, bArr12)) {
                                    throw new IOException("Encountered error while checking VP8 signature");
                                }
                                i4 = q25.readInt();
                                i3 = (i4 << 18) >> 18;
                                i6 -= 10;
                                i2 = (i4 << 2) >> 18;
                                z2 = false;
                            } else {
                                ou0 = ou02;
                                if (!Arrays.equals(bArr4, bArr7)) {
                                    i4 = 0;
                                    i3 = 0;
                                    z2 = false;
                                    i2 = 0;
                                } else if (q25.readByte() == 47) {
                                    i4 = q25.readInt();
                                    z2 = true;
                                    i3 = (i4 & 16383) + 1;
                                    i2 = ((i4 & 268419072) >>> 14) + 1;
                                    if ((i4 & 268435456) == 0) {
                                        z2 = false;
                                    }
                                    i6 -= 5;
                                } else {
                                    throw new IOException("Encountered error while checking VP8L signature");
                                }
                            }
                            ou03.write(bArr5);
                            ou03.d(10);
                            byte[] bArr13 = new byte[10];
                            if (z2) {
                                bArr13[0] = (byte) (bArr13[0] | 16);
                            }
                            bArr13[0] = (byte) (bArr13[0] | 8);
                            int i7 = i3 - 1;
                            int i8 = i2 - 1;
                            bArr = bArr3;
                            bArr13[4] = (byte) i7;
                            bArr13[5] = (byte) (i7 >> 8);
                            bArr13[6] = (byte) (i7 >> 16);
                            bArr13[7] = (byte) i8;
                            bArr13[8] = (byte) (i8 >> 8);
                            bArr13[9] = (byte) (i8 >> 16);
                            ou03.write(bArr13);
                            ou03.write(bArr4);
                            ou03.d(readInt4);
                            if (Arrays.equals(bArr4, bArr6)) {
                                ou03.write(bArr10);
                                ou03.write(bArr11);
                                ou03.d(i4);
                            } else if (Arrays.equals(bArr4, bArr7)) {
                                ou03.write(47);
                                ou03.d(i4);
                            }
                            pfa.h(q25, ou03, i6);
                            K(ou03);
                            pfa.i(q25, ou03);
                            byte[] bArr14 = bArr;
                            ou0 ou04 = ou0;
                            ou04.d(byteArrayOutputStream2.size() + bArr14.length);
                            ou04.write(bArr14);
                            byteArrayOutputStream2.writeTo(ou04);
                            pfa.e(byteArrayOutputStream2);
                        }
                    } else {
                        throw new IOException("Encountered invalid length while parsing WebP chunk type");
                    }
                }
                ou0 = ou02;
                bArr = bArr3;
                pfa.i(q25, ou03);
                byte[] bArr142 = bArr;
                ou0 ou042 = ou0;
                ou042.d(byteArrayOutputStream2.size() + bArr142.length);
                ou042.write(bArr142);
                byteArrayOutputStream2.writeTo(ou042);
                pfa.e(byteArrayOutputStream2);
            } catch (Exception e2) {
                e = e2;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    pfa.e(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                pfa.e(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            throw new IOException("Failed to save WebP file", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x020f, code lost:
        r4 = 0;
        r5 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r4 = 1
            java.lang.String r5 = "DateTime"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0020
            java.lang.String r5 = "DateTimeOriginal"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0020
            java.lang.String r5 = "DateTimeDigitized"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x004f
        L_0x0020:
            if (r2 == 0) goto L_0x004f
            java.util.regex.Pattern r5 = d0
            java.util.regex.Matcher r5 = r5.matcher(r2)
            boolean r5 = r5.find()
            java.util.regex.Pattern r6 = e0
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r6 = r6.find()
            int r7 = r20.length()
            r8 = 19
            if (r7 != r8) goto L_0x004e
            if (r5 != 0) goto L_0x0043
            if (r6 != 0) goto L_0x0043
            goto L_0x004e
        L_0x0043:
            if (r6 == 0) goto L_0x004f
            java.lang.String r5 = "-"
            java.lang.String r6 = ":"
            java.lang.String r2 = r2.replaceAll(r5, r6)
            goto L_0x004f
        L_0x004e:
            return
        L_0x004f:
            java.lang.String r5 = "ISOSpeedRatings"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0059
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0059:
            r5 = 2
            if (r2 == 0) goto L_0x00ca
            java.util.HashSet r6 = X
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x00ca
            java.lang.String r6 = "GPSTimeStamp"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00b2
            java.util.regex.Pattern r6 = c0
            java.util.regex.Matcher r2 = r6.matcher(r2)
            boolean r6 = r2.find()
            if (r6 != 0) goto L_0x0079
            return
        L_0x0079:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.group(r4)
            int r7 = java.lang.Integer.parseInt(r7)
            r6.append(r7)
            java.lang.String r7 = "/1,"
            r6.append(r7)
            java.lang.String r8 = r2.group(r5)
            int r8 = java.lang.Integer.parseInt(r8)
            r6.append(r8)
            r6.append(r7)
            r7 = 3
            java.lang.String r2 = r2.group(r7)
            int r2 = java.lang.Integer.parseInt(r2)
            r6.append(r2)
            java.lang.String r2 = "/1"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto L_0x00ca
        L_0x00b2:
            double r6 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x00c9 }
            t25 r2 = new t25     // Catch:{ NumberFormatException -> 0x00c9 }
            r8 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r6 = r6 * r8
            long r6 = (long) r6     // Catch:{ NumberFormatException -> 0x00c9 }
            r8 = 10000(0x2710, double:4.9407E-320)
            r2.<init>(r6, r8)     // Catch:{ NumberFormatException -> 0x00c9 }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x00c9 }
            goto L_0x00ca
        L_0x00c9:
            return
        L_0x00ca:
            r6 = r3
        L_0x00cb:
            s25[][] r7 = T
            int r7 = r7.length
            if (r6 >= r7) goto L_0x0320
            r7 = 4
            if (r6 != r7) goto L_0x00db
            boolean r7 = r0.h
            if (r7 != 0) goto L_0x00db
        L_0x00d7:
            r5 = r4
            r4 = r3
            goto L_0x031a
        L_0x00db:
            java.util.HashMap[] r7 = W
            r7 = r7[r6]
            java.lang.Object r7 = r7.get(r1)
            s25 r7 = (defpackage.s25) r7
            if (r7 == 0) goto L_0x00d7
            java.util.HashMap[] r8 = r0.e
            if (r2 != 0) goto L_0x00f1
            r7 = r8[r6]
            r7.remove(r1)
            goto L_0x00d7
        L_0x00f1:
            android.util.Pair r9 = q(r2)
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r11 = -1
            int r12 = r7.c
            if (r12 == r10) goto L_0x015d
            java.lang.Object r10 = r9.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r12 != r10) goto L_0x010d
            goto L_0x015d
        L_0x010d:
            int r7 = r7.d
            if (r7 == r11) goto L_0x0127
            java.lang.Object r10 = r9.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r7 == r10) goto L_0x0125
            java.lang.Object r10 = r9.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r7 != r10) goto L_0x0127
        L_0x0125:
            r12 = r7
            goto L_0x015d
        L_0x0127:
            if (r12 == r4) goto L_0x015d
            r10 = 7
            if (r12 == r10) goto L_0x015d
            if (r12 != r5) goto L_0x012f
            goto L_0x015d
        L_0x012f:
            boolean r8 = t
            if (r8 == 0) goto L_0x00d7
            java.lang.String[] r8 = P
            r10 = r8[r12]
            if (r7 != r11) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r7 = r8[r7]
        L_0x013c:
            java.lang.Object r7 = r9.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r8[r7]
            java.lang.Object r7 = r9.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r11) goto L_0x0151
            goto L_0x00d7
        L_0x0151:
            java.lang.Object r7 = r9.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r7 = r8[r7]
            goto L_0x00d7
        L_0x015d:
            java.lang.String r7 = "/"
            int[] r9 = Q
            java.lang.String r10 = ","
            switch(r12) {
                case 1: goto L_0x02df;
                case 2: goto L_0x02d4;
                case 3: goto L_0x02b0;
                case 4: goto L_0x028c;
                case 5: goto L_0x0254;
                case 6: goto L_0x0166;
                case 7: goto L_0x02d4;
                case 8: goto L_0x0166;
                case 9: goto L_0x0213;
                case 10: goto L_0x01a7;
                case 11: goto L_0x0166;
                case 12: goto L_0x0168;
                default: goto L_0x0166;
            }
        L_0x0166:
            goto L_0x00d7
        L_0x0168:
            java.lang.String[] r7 = r2.split(r10, r11)
            int r10 = r7.length
            double[] r11 = new double[r10]
            r12 = r3
        L_0x0170:
            int r13 = r7.length
            if (r12 >= r13) goto L_0x017d
            r13 = r7[r12]
            double r13 = java.lang.Double.parseDouble(r13)
            r11[r12] = r13
            int r12 = r12 + r4
            goto L_0x0170
        L_0x017d:
            r7 = r8[r6]
            java.nio.ByteOrder r8 = r0.g
            r12 = 12
            r9 = r9[r12]
            int r9 = r9 * r10
            byte[] r9 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.order(r8)
            r8 = r3
        L_0x0190:
            if (r8 >= r10) goto L_0x0199
            r13 = r11[r8]
            r9.putDouble(r13)
            int r8 = r8 + r4
            goto L_0x0190
        L_0x0199:
            r25 r8 = new r25
            byte[] r9 = r9.array()
            r8.<init>(r12, r9, r10)
            r7.put(r1, r8)
            goto L_0x00d7
        L_0x01a7:
            java.lang.String[] r10 = r2.split(r10, r11)
            int r12 = r10.length
            t25[] r13 = new defpackage.t25[r12]
            r14 = r3
        L_0x01af:
            int r15 = r10.length
            if (r14 >= r15) goto L_0x01d8
            r15 = r10[r14]
            java.lang.String[] r15 = r15.split(r7, r11)
            t25 r5 = new t25
            r16 = r15[r3]
            r17 = r12
            double r11 = java.lang.Double.parseDouble(r16)
            long r11 = (long) r11
            r15 = r15[r4]
            double r3 = java.lang.Double.parseDouble(r15)
            long r3 = (long) r3
            r5.<init>(r11, r3)
            r13[r14] = r5
            r3 = 1
            int r14 = r14 + r3
            r4 = r3
            r12 = r17
            r3 = 0
            r5 = 2
            r11 = -1
            goto L_0x01af
        L_0x01d8:
            r17 = r12
            r3 = r8[r6]
            java.nio.ByteOrder r4 = r0.g
            r5 = 10
            r7 = r9[r5]
            int r7 = r7 * r17
            byte[] r7 = new byte[r7]
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            r7.order(r4)
            r8 = r17
            r4 = 0
        L_0x01f0:
            if (r4 >= r8) goto L_0x0203
            r9 = r13[r4]
            long r10 = r9.a
            int r10 = (int) r10
            r7.putInt(r10)
            long r9 = r9.b
            int r9 = (int) r9
            r7.putInt(r9)
            r9 = 1
            int r4 = r4 + r9
            goto L_0x01f0
        L_0x0203:
            r25 r4 = new r25
            byte[] r7 = r7.array()
            r4.<init>(r5, r7, r8)
            r3.put(r1, r4)
        L_0x020f:
            r4 = 0
            r5 = 1
            goto L_0x031a
        L_0x0213:
            r3 = r11
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r5 = new int[r4]
            r7 = 0
        L_0x021c:
            int r10 = r3.length
            if (r7 >= r10) goto L_0x022a
            r10 = r3[r7]
            int r10 = java.lang.Integer.parseInt(r10)
            r5[r7] = r10
            r10 = 1
            int r7 = r7 + r10
            goto L_0x021c
        L_0x022a:
            r3 = r8[r6]
            java.nio.ByteOrder r7 = r0.g
            r8 = 9
            r9 = r9[r8]
            int r9 = r9 * r4
            byte[] r9 = new byte[r9]
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.order(r7)
            r7 = 0
        L_0x023d:
            if (r7 >= r4) goto L_0x0247
            r10 = r5[r7]
            r9.putInt(r10)
            r10 = 1
            int r7 = r7 + r10
            goto L_0x023d
        L_0x0247:
            r25 r5 = new r25
            byte[] r7 = r9.array()
            r5.<init>(r8, r7, r4)
            r3.put(r1, r5)
            goto L_0x020f
        L_0x0254:
            r3 = r11
            java.lang.String[] r4 = r2.split(r10, r3)
            int r5 = r4.length
            t25[] r5 = new defpackage.t25[r5]
            r9 = 0
        L_0x025d:
            int r10 = r4.length
            if (r9 >= r10) goto L_0x0280
            r10 = r4[r9]
            java.lang.String[] r10 = r10.split(r7, r3)
            t25 r3 = new t25
            r11 = 0
            r12 = r10[r11]
            double r11 = java.lang.Double.parseDouble(r12)
            long r11 = (long) r11
            r13 = 1
            r10 = r10[r13]
            double r14 = java.lang.Double.parseDouble(r10)
            long r14 = (long) r14
            r3.<init>(r11, r14)
            r5[r9] = r3
            int r9 = r9 + r13
            r3 = -1
            goto L_0x025d
        L_0x0280:
            r3 = r8[r6]
            java.nio.ByteOrder r4 = r0.g
            r25 r4 = defpackage.r25.d(r5, r4)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x028c:
            r3 = r11
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r11 = 0
        L_0x0295:
            int r5 = r3.length
            if (r11 >= r5) goto L_0x02a3
            r5 = r3[r11]
            long r9 = java.lang.Long.parseLong(r5)
            r4[r11] = r9
            r5 = 1
            int r11 = r11 + r5
            goto L_0x0295
        L_0x02a3:
            r3 = r8[r6]
            java.nio.ByteOrder r5 = r0.g
            r25 r4 = defpackage.r25.c(r4, r5)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x02b0:
            r3 = r11
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r11 = 0
        L_0x02b9:
            int r5 = r3.length
            if (r11 >= r5) goto L_0x02c7
            r5 = r3[r11]
            int r5 = java.lang.Integer.parseInt(r5)
            r4[r11] = r5
            r5 = 1
            int r11 = r11 + r5
            goto L_0x02b9
        L_0x02c7:
            r3 = r8[r6]
            java.nio.ByteOrder r5 = r0.g
            r25 r4 = defpackage.r25.f(r4, r5)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x02d4:
            r3 = r8[r6]
            r25 r4 = defpackage.r25.a(r2)
            r3.put(r1, r4)
            goto L_0x020f
        L_0x02df:
            r3 = r8[r6]
            int r4 = r2.length()
            r5 = 1
            if (r4 != r5) goto L_0x0309
            r4 = 0
            char r7 = r2.charAt(r4)
            r8 = 48
            if (r7 < r8) goto L_0x030a
            char r7 = r2.charAt(r4)
            r9 = 49
            if (r7 > r9) goto L_0x030a
            char r7 = r2.charAt(r4)
            int r7 = r7 - r8
            byte r7 = (byte) r7
            byte[] r8 = new byte[r5]
            r8[r4] = r7
            r25 r7 = new r25
            r7.<init>(r5, r8, r5)
            goto L_0x0317
        L_0x0309:
            r4 = 0
        L_0x030a:
            java.nio.charset.Charset r7 = Z
            byte[] r7 = r2.getBytes(r7)
            r25 r8 = new r25
            int r9 = r7.length
            r8.<init>(r5, r7, r9)
            r7 = r8
        L_0x0317:
            r3.put(r1, r7)
        L_0x031a:
            int r6 = r6 + r5
            r3 = r4
            r4 = r5
            r5 = 2
            goto L_0x00cb
        L_0x0320:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.F(java.lang.String, java.lang.String):void");
    }

    public final void G(q25 q25) {
        r25 r25;
        q25 q252 = q25;
        HashMap hashMap = this.e[4];
        r25 r252 = (r25) hashMap.get("Compression");
        if (r252 != null) {
            int h2 = r252.h(this.g);
            this.n = h2;
            if (h2 != 1) {
                if (h2 == 6) {
                    r(q252, hashMap);
                    return;
                } else if (h2 != 7) {
                    return;
                }
            }
            r25 r253 = (r25) hashMap.get("BitsPerSample");
            if (r253 != null) {
                int[] iArr = (int[]) r253.j(this.g);
                int[] iArr2 = u;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.d == 3 && (r25 = (r25) hashMap.get("PhotometricInterpretation")) != null) {
                        int h3 = r25.h(this.g);
                        if ((h3 != 1 || !Arrays.equals(iArr, v)) && (h3 != 6 || !Arrays.equals(iArr, iArr2))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                r25 r254 = (r25) hashMap.get("StripOffsets");
                r25 r255 = (r25) hashMap.get("StripByteCounts");
                if (r254 != null && r255 != null) {
                    long[] g2 = pfa.g(r254.j(this.g));
                    long[] g3 = pfa.g(r255.j(this.g));
                    if (g2 != null && g2.length != 0 && g3 != null && g3.length != 0 && g2.length == g3.length) {
                        long j2 = 0;
                        for (long j3 : g3) {
                            j2 += j3;
                        }
                        int i2 = (int) j2;
                        byte[] bArr = new byte[i2];
                        this.j = true;
                        this.i = true;
                        this.h = true;
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        while (i3 < g2.length) {
                            int i6 = (int) g2[i3];
                            int i7 = (int) g3[i3];
                            if (i3 < g2.length - 1 && ((long) (i6 + i7)) != g2[i3 + 1]) {
                                this.j = false;
                            }
                            int i8 = i6 - i4;
                            if (i8 >= 0) {
                                long j4 = (long) i8;
                                if (q252.skip(j4) == j4) {
                                    int i9 = i4 + i8;
                                    byte[] bArr2 = new byte[i7];
                                    if (q252.read(bArr2) == i7) {
                                        i4 = i9 + i7;
                                        System.arraycopy(bArr2, 0, bArr, i5, i7);
                                        i5 += i7;
                                        i3++;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        this.m = bArr;
                        if (this.j) {
                            this.k = (int) g2[0];
                            this.l = i2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.n = 6;
        r(q252, hashMap);
    }

    public final void H(int i2, int i3) {
        HashMap[] hashMapArr = this.e;
        if (!hashMapArr[i2].isEmpty() && !hashMapArr[i3].isEmpty()) {
            r25 r25 = (r25) hashMapArr[i2].get("ImageLength");
            r25 r252 = (r25) hashMapArr[i2].get("ImageWidth");
            r25 r253 = (r25) hashMapArr[i3].get("ImageLength");
            r25 r254 = (r25) hashMapArr[i3].get("ImageWidth");
            if (r25 != null && r252 != null && r253 != null && r254 != null) {
                int h2 = r25.h(this.g);
                int h3 = r252.h(this.g);
                int h4 = r253.h(this.g);
                int h5 = r254.h(this.g);
                if (h2 < h4 && h3 < h5) {
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    public final void I(u25 u25, int i2) {
        r25 r25;
        r25 r252;
        HashMap[] hashMapArr = this.e;
        r25 r253 = (r25) hashMapArr[i2].get("DefaultCropSize");
        r25 r254 = (r25) hashMapArr[i2].get("SensorTopBorder");
        r25 r255 = (r25) hashMapArr[i2].get("SensorLeftBorder");
        r25 r256 = (r25) hashMapArr[i2].get("SensorBottomBorder");
        r25 r257 = (r25) hashMapArr[i2].get("SensorRightBorder");
        if (r253 != null) {
            if (r253.a == 5) {
                t25[] t25Arr = (t25[]) r253.j(this.g);
                if (t25Arr == null || t25Arr.length != 2) {
                    Arrays.toString(t25Arr);
                    return;
                }
                r252 = r25.d(new t25[]{t25Arr[0]}, this.g);
                r25 = r25.d(new t25[]{t25Arr[1]}, this.g);
            } else {
                int[] iArr = (int[]) r253.j(this.g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    r252 = r25.e(iArr[0], this.g);
                    r25 = r25.e(iArr[1], this.g);
                }
            }
            hashMapArr[i2].put("ImageWidth", r252);
            hashMapArr[i2].put("ImageLength", r25);
        } else if (r254 == null || r255 == null || r256 == null || r257 == null) {
            r25 r258 = (r25) hashMapArr[i2].get("ImageLength");
            r25 r259 = (r25) hashMapArr[i2].get("ImageWidth");
            if (r258 == null || r259 == null) {
                r25 r2510 = (r25) hashMapArr[i2].get("JPEGInterchangeFormat");
                r25 r2511 = (r25) hashMapArr[i2].get("JPEGInterchangeFormatLength");
                if (r2510 != null && r2511 != null) {
                    int h2 = r2510.h(this.g);
                    int h3 = r2510.h(this.g);
                    u25.d((long) h2);
                    byte[] bArr = new byte[h3];
                    u25.read(bArr);
                    h(new q25(bArr), h2, i2);
                }
            }
        } else {
            int h4 = r254.h(this.g);
            int h5 = r256.h(this.g);
            int h6 = r257.h(this.g);
            int h7 = r255.h(this.g);
            if (h5 > h4 && h6 > h7) {
                r25 e2 = r25.e(h5 - h4, this.g);
                r25 e3 = r25.e(h6 - h7, this.g);
                hashMapArr[i2].put("ImageLength", e2);
                hashMapArr[i2].put("ImageWidth", e3);
            }
        }
    }

    public final void J() {
        H(0, 5);
        H(0, 4);
        H(5, 4);
        HashMap[] hashMapArr = this.e;
        r25 r25 = (r25) hashMapArr[1].get("PixelXDimension");
        r25 r252 = (r25) hashMapArr[1].get("PixelYDimension");
        if (!(r25 == null || r252 == null)) {
            hashMapArr[0].put("ImageWidth", r25);
            hashMapArr[0].put("ImageLength", r252);
        }
        if (hashMapArr[4].isEmpty() && s(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        s(hashMapArr[4]);
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void K(ou0 ou0) {
        HashMap[] hashMapArr;
        int[] iArr;
        Object[] objArr;
        ou0 ou02 = ou0;
        s25[][] s25Arr = T;
        int[] iArr2 = new int[s25Arr.length];
        int[] iArr3 = new int[s25Arr.length];
        s25[] s25Arr2 = U;
        for (s25 s25 : s25Arr2) {
            z(s25.b);
        }
        if (this.h) {
            if (this.i) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        while (true) {
            int length = s25Arr.length;
            hashMapArr = this.e;
            if (i2 >= length) {
                break;
            }
            Object[] array = hashMapArr[i2].entrySet().toArray();
            int length2 = array.length;
            int i3 = 0;
            while (i3 < length2) {
                Map.Entry entry = (Map.Entry) array[i3];
                if (entry.getValue() == null) {
                    objArr = array;
                    hashMapArr[i2].remove(entry.getKey());
                } else {
                    objArr = array;
                }
                i3++;
                array = objArr;
            }
            i2++;
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(s25Arr2[1].b, r25.b(0, this.g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(s25Arr2[2].b, r25.b(0, this.g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(s25Arr2[3].b, r25.b(0, this.g));
        }
        if (this.h) {
            if (this.i) {
                hashMapArr[4].put("StripOffsets", r25.e(0, this.g));
                hashMapArr[4].put("StripByteCounts", r25.e(this.l, this.g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", r25.b(0, this.g));
                hashMapArr[4].put("JPEGInterchangeFormatLength", r25.b((long) this.l, this.g));
            }
        }
        int i4 = 0;
        while (true) {
            int length3 = s25Arr.length;
            iArr = Q;
            if (i4 >= length3) {
                break;
            }
            int i5 = 0;
            for (Map.Entry value : hashMapArr[i4].entrySet()) {
                r25 r25 = (r25) value.getValue();
                r25.getClass();
                int i6 = iArr[r25.a] * r25.b;
                if (i6 > 4) {
                    i5 += i6;
                }
            }
            iArr3[i4] = iArr3[i4] + i5;
            i4++;
        }
        int i7 = 8;
        for (int i8 = 0; i8 < s25Arr.length; i8++) {
            if (!hashMapArr[i8].isEmpty()) {
                iArr2[i8] = i7;
                i7 = (hashMapArr[i8].size() * 12) + 6 + iArr3[i8] + i7;
            }
        }
        if (this.h) {
            if (this.i) {
                hashMapArr[4].put("StripOffsets", r25.e(i7, this.g));
            } else {
                hashMapArr[4].put("JPEGInterchangeFormat", r25.b((long) i7, this.g));
            }
            this.k = i7;
            i7 += this.l;
        }
        if (this.d == 4) {
            i7 += 8;
        }
        if (t) {
            for (int i9 = 0; i9 < s25Arr.length; i9++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i9), Integer.valueOf(iArr2[i9]), Integer.valueOf(hashMapArr[i9].size()), Integer.valueOf(iArr3[i9]), Integer.valueOf(i7)});
            }
        }
        if (!hashMapArr[1].isEmpty()) {
            hashMapArr[0].put(s25Arr2[1].b, r25.b((long) iArr2[1], this.g));
        }
        if (!hashMapArr[2].isEmpty()) {
            hashMapArr[0].put(s25Arr2[2].b, r25.b((long) iArr2[2], this.g));
        }
        if (!hashMapArr[3].isEmpty()) {
            hashMapArr[1].put(s25Arr2[3].b, r25.b((long) iArr2[3], this.g));
        }
        int i10 = this.d;
        if (i10 == 4) {
            ou02.g((short) i7);
            ou02.write(a0);
        } else if (i10 == 13) {
            ou02.d(i7);
            ou02.write(D);
        } else if (i10 == 14) {
            ou02.write(I);
            ou02.d(i7);
        }
        ou02.g(this.g == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        ou02.c = this.g;
        ou02.g((short) 42);
        ou02.d((int) 8);
        for (int i11 = 0; i11 < s25Arr.length; i11++) {
            if (!hashMapArr[i11].isEmpty()) {
                ou02.g((short) hashMapArr[i11].size());
                int size = (hashMapArr[i11].size() * 12) + iArr2[i11] + 2 + 4;
                for (Map.Entry entry2 : hashMapArr[i11].entrySet()) {
                    int i12 = ((s25) W[i11].get(entry2.getKey())).a;
                    r25 r252 = (r25) entry2.getValue();
                    r252.getClass();
                    int i13 = r252.a;
                    int i14 = iArr[i13];
                    int i15 = r252.b;
                    int i16 = i14 * i15;
                    ou02.g((short) i12);
                    ou02.g((short) i13);
                    ou02.d(i15);
                    if (i16 > 4) {
                        ou02.d((int) ((long) size));
                        size += i16;
                    } else {
                        ou02.write(r252.d);
                        if (i16 < 4) {
                            while (i16 < 4) {
                                ou02.a(0);
                                i16++;
                            }
                        }
                    }
                }
                if (i11 != 0 || hashMapArr[4].isEmpty()) {
                    ou02.d((int) 0);
                } else {
                    ou02.d((int) ((long) iArr2[4]));
                }
                for (Map.Entry value2 : hashMapArr[i11].entrySet()) {
                    byte[] bArr = ((r25) value2.getValue()).d;
                    if (bArr.length > 4) {
                        ou02.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.h) {
            ou02.write(o());
        }
        if (this.d == 14 && i7 % 2 == 1) {
            ou02.a(0);
        }
        ou02.c = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String d2 = d("DateTimeOriginal");
        HashMap[] hashMapArr = this.e;
        if (d2 != null && d("DateTime") == null) {
            hashMapArr[0].put("DateTime", r25.a(d2));
        }
        if (d("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", r25.b(0, this.g));
        }
        if (d("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", r25.b(0, this.g));
        }
        if (d("Orientation") == null) {
            hashMapArr[0].put("Orientation", r25.b(0, this.g));
        }
        if (d("LightSource") == null) {
            hashMapArr[1].put("LightSource", r25.b(0, this.g));
        }
    }

    public final String d(String str) {
        if (str != null) {
            r25 f2 = f(str);
            if (f2 != null) {
                if (!X.contains(str)) {
                    return f2.i(this.g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i2 = f2.a;
                    if (i2 != 5 && i2 != 10) {
                        return null;
                    }
                    t25[] t25Arr = (t25[]) f2.j(this.g);
                    if (t25Arr == null || t25Arr.length != 3) {
                        Arrays.toString(t25Arr);
                        return null;
                    }
                    t25 t25 = t25Arr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) t25.a) / ((float) t25.b)));
                    t25 t252 = t25Arr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) t252.a) / ((float) t252.b)));
                    t25 t253 = t25Arr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) t253.a) / ((float) t253.b)))});
                }
                try {
                    return Double.toString(f2.g(this.g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public final int e(int i2, String str) {
        r25 f2 = f(str);
        if (f2 == null) {
            return i2;
        }
        try {
            return f2.h(this.g);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public final r25 f(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            for (int i2 = 0; i2 < T.length; i2++) {
                r25 r25 = (r25) this.e[i2].get(str);
                if (r25 != null) {
                    return r25;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:51|52|53) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010e, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010f, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0107 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.u25 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "yes"
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            p25 r2 = new p25     // Catch:{ RuntimeException -> 0x0107 }
            r2.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            defpackage.x25.a(r1, r2)     // Catch:{ RuntimeException -> 0x0107 }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x0107 }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0107 }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0107 }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x0107 }
            if (r4 == 0) goto L_0x0043
            r0 = 29
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0107 }
            r4 = 30
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 31
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x005f
        L_0x0040:
            r11 = move-exception
            goto L_0x010f
        L_0x0043:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0107 }
            if (r0 == 0) goto L_0x005c
            r0 = 18
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0107 }
            r4 = 19
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 24
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x005f
        L_0x005c:
            r0 = 0
            r4 = r0
            r5 = r4
        L_0x005f:
            java.util.HashMap[] r6 = r11.e
            r7 = 0
            if (r0 == 0) goto L_0x0075
            r8 = r6[r7]     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r9 = "ImageWidth"
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0107 }
            java.nio.ByteOrder r10 = r11.g     // Catch:{ RuntimeException -> 0x0107 }
            r25 r0 = defpackage.r25.e(r0, r10)     // Catch:{ RuntimeException -> 0x0107 }
            r8.put(r9, r0)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0075:
            if (r4 == 0) goto L_0x0088
            r0 = r6[r7]     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r8 = "ImageLength"
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0107 }
            java.nio.ByteOrder r9 = r11.g     // Catch:{ RuntimeException -> 0x0107 }
            r25 r4 = defpackage.r25.e(r4, r9)     // Catch:{ RuntimeException -> 0x0107 }
            r0.put(r8, r4)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0088:
            r0 = 6
            if (r5 == 0) goto L_0x00b0
            int r4 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x0107 }
            r5 = 90
            if (r4 == r5) goto L_0x00a2
            r5 = 180(0xb4, float:2.52E-43)
            if (r4 == r5) goto L_0x00a0
            r5 = 270(0x10e, float:3.78E-43)
            if (r4 == r5) goto L_0x009d
            r4 = 1
            goto L_0x00a3
        L_0x009d:
            r4 = 8
            goto L_0x00a3
        L_0x00a0:
            r4 = 3
            goto L_0x00a3
        L_0x00a2:
            r4 = r0
        L_0x00a3:
            r5 = r6[r7]     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r6 = "Orientation"
            java.nio.ByteOrder r8 = r11.g     // Catch:{ RuntimeException -> 0x0107 }
            r25 r4 = defpackage.r25.e(r4, r8)     // Catch:{ RuntimeException -> 0x0107 }
            r5.put(r6, r4)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00b0:
            if (r2 == 0) goto L_0x0103
            if (r3 == 0) goto L_0x0103
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x0107 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0107 }
            if (r3 <= r0) goto L_0x00fb
            long r4 = (long) r2     // Catch:{ RuntimeException -> 0x0107 }
            r12.d(r4)     // Catch:{ RuntimeException -> 0x0107 }
            byte[] r4 = new byte[r0]     // Catch:{ RuntimeException -> 0x0107 }
            int r5 = r12.read(r4)     // Catch:{ RuntimeException -> 0x0107 }
            if (r5 != r0) goto L_0x00f3
            int r2 = r2 + r0
            int r3 = r3 + -6
            byte[] r0 = a0     // Catch:{ RuntimeException -> 0x0107 }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ RuntimeException -> 0x0107 }
            if (r0 == 0) goto L_0x00eb
            byte[] r0 = new byte[r3]     // Catch:{ RuntimeException -> 0x0107 }
            int r12 = r12.read(r0)     // Catch:{ RuntimeException -> 0x0107 }
            if (r12 != r3) goto L_0x00e3
            r11.o = r2     // Catch:{ RuntimeException -> 0x0107 }
            r11.x(r7, r0)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x0103
        L_0x00e3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Can't read exif"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00eb:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Invalid identifier"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00f3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Can't read identifier"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00fb:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Invalid exif length"
            r11.<init>(r12)     // Catch:{ RuntimeException -> 0x0107 }
            throw r11     // Catch:{ RuntimeException -> 0x0107 }
        L_0x0103:
            r1.release()
            return
        L_0x0107:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0040 }
            java.lang.String r12 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r11.<init>(r12)     // Catch:{ all -> 0x0040 }
            throw r11     // Catch:{ all -> 0x0040 }
        L_0x010f:
            r1.release()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.g(u25):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0141 A[LOOP:0: B:8:0x0023->B:73:0x0141, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0148 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(defpackage.q25 r23, int r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            boolean r3 = t
            if (r3 == 0) goto L_0x000d
            java.util.Objects.toString(r23)
        L_0x000d:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.b = r4
            byte r4 = r23.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r4 != r6) goto L_0x018b
            byte r7 = r23.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x0173
            r4 = 2
        L_0x0023:
            byte r5 = r23.readByte()
            if (r5 != r6) goto L_0x0159
            byte r5 = r23.readByte()
            if (r3 == 0) goto L_0x0034
            r7 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r7)
        L_0x0034:
            r7 = -39
            if (r5 == r7) goto L_0x0154
            r7 = -38
            if (r5 != r7) goto L_0x003e
            goto L_0x0154
        L_0x003e:
            int r7 = r23.readUnsignedShort()
            int r8 = r7 + -2
            r9 = 4
            int r4 = r4 + r9
            if (r3 == 0) goto L_0x004d
            r10 = r5 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r10)
        L_0x004d:
            java.lang.String r10 = "Invalid length"
            if (r8 < 0) goto L_0x014e
            r11 = 0
            r12 = 1
            r13 = -31
            java.util.HashMap[] r14 = r0.e
            if (r5 == r13) goto L_0x00ca
            r13 = -2
            if (r5 == r13) goto L_0x009f
            switch(r5) {
                case -64: goto L_0x006a;
                case -63: goto L_0x006a;
                case -62: goto L_0x006a;
                case -61: goto L_0x006a;
                default: goto L_0x005f;
            }
        L_0x005f:
            switch(r5) {
                case -59: goto L_0x006a;
                case -58: goto L_0x006a;
                case -57: goto L_0x006a;
                default: goto L_0x0062;
            }
        L_0x0062:
            switch(r5) {
                case -55: goto L_0x006a;
                case -54: goto L_0x006a;
                case -53: goto L_0x006a;
                default: goto L_0x0065;
            }
        L_0x0065:
            switch(r5) {
                case -51: goto L_0x006a;
                case -50: goto L_0x006a;
                case -49: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x013f
        L_0x006a:
            r1.a(r12)
            r5 = r14[r2]
            if (r2 == r9) goto L_0x0074
            java.lang.String r8 = "ImageLength"
            goto L_0x0076
        L_0x0074:
            java.lang.String r8 = "ThumbnailImageLength"
        L_0x0076:
            int r11 = r23.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.g
            r25 r11 = defpackage.r25.b(r11, r13)
            r5.put(r8, r11)
            r5 = r14[r2]
            if (r2 == r9) goto L_0x008b
            java.lang.String r8 = "ImageWidth"
            goto L_0x008d
        L_0x008b:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x008d:
            int r9 = r23.readUnsignedShort()
            long r11 = (long) r9
            java.nio.ByteOrder r9 = r0.g
            r25 r9 = defpackage.r25.b(r11, r9)
            r5.put(r8, r9)
            int r8 = r7 + -7
            goto L_0x013f
        L_0x009f:
            byte[] r5 = new byte[r8]
            int r7 = r1.read(r5)
            if (r7 != r8) goto L_0x00c2
            java.lang.String r7 = "UserComment"
            java.lang.String r8 = r0.d(r7)
            if (r8 != 0) goto L_0x00bf
            r8 = r14[r12]
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r12 = Z
            r9.<init>(r5, r12)
            r25 r5 = defpackage.r25.a(r9)
            r8.put(r7, r5)
        L_0x00bf:
            r8 = r11
            goto L_0x013f
        L_0x00c2:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Invalid exif"
            r0.<init>(r1)
            throw r0
        L_0x00ca:
            byte[] r5 = new byte[r8]
            r1.readFully(r5)
            int r7 = r4 + r8
            byte[] r9 = a0
            if (r9 != 0) goto L_0x00d6
            goto L_0x00e4
        L_0x00d6:
            int r13 = r9.length
            if (r8 >= r13) goto L_0x00da
            goto L_0x00e4
        L_0x00da:
            r13 = r11
        L_0x00db:
            int r15 = r9.length
            if (r13 >= r15) goto L_0x0127
            byte r15 = r5[r13]
            byte r6 = r9[r13]
            if (r15 == r6) goto L_0x0123
        L_0x00e4:
            byte[] r6 = b0
            if (r6 != 0) goto L_0x00e9
            goto L_0x013d
        L_0x00e9:
            int r9 = r6.length
            if (r8 >= r9) goto L_0x00ed
            goto L_0x013d
        L_0x00ed:
            r9 = r11
        L_0x00ee:
            int r13 = r6.length
            if (r9 >= r13) goto L_0x00fb
            byte r13 = r5[r9]
            byte r15 = r6[r9]
            if (r13 == r15) goto L_0x00f8
            goto L_0x013d
        L_0x00f8:
            int r9 = r9 + 1
            goto L_0x00ee
        L_0x00fb:
            int r9 = r6.length
            int r4 = r4 + r9
            int r6 = r6.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r6, r8)
            java.lang.String r6 = "Xmp"
            java.lang.String r8 = r0.d(r6)
            if (r8 != 0) goto L_0x013d
            r8 = r14[r11]
            r25 r9 = new r25
            int r13 = r5.length
            long r14 = (long) r4
            r20 = 1
            r16 = r9
            r17 = r14
            r19 = r5
            r21 = r13
            r16.<init>(r17, r19, r20, r21)
            r8.put(r6, r9)
            r0.s = r12
            goto L_0x013d
        L_0x0123:
            int r13 = r13 + 1
            r6 = -1
            goto L_0x00db
        L_0x0127:
            int r6 = r9.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r6, r8)
            int r4 = r24 + r4
            int r6 = r9.length
            int r4 = r4 + r6
            r0.o = r4
            r0.x(r2, r5)
            q25 r4 = new q25
            r4.<init>((byte[]) r5)
            r0.G(r4)
        L_0x013d:
            r4 = r7
            goto L_0x00bf
        L_0x013f:
            if (r8 < 0) goto L_0x0148
            r1.a(r8)
            int r4 = r4 + r8
            r6 = -1
            goto L_0x0023
        L_0x0148:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x014e:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r10)
            throw r0
        L_0x0154:
            java.nio.ByteOrder r0 = r0.g
            r1.b = r0
            return
        L_0x0159:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid marker:"
            r1.<init>(r2)
            r2 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0173:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r2 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r2 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.h(q25, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b6, code lost:
        if (r6 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0126 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00f2 A[SYNTHETIC, Splitter:B:86:0x00f2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r1.mark(r2)
            byte[] r3 = new byte[r2]
            r1.read(r3)
            r18.reset()
            r1 = 0
            r4 = r1
        L_0x0013:
            byte[] r5 = w
            int r6 = r5.length
            r7 = 4
            if (r4 >= r6) goto L_0x0176
            byte r6 = r3[r4]
            byte r5 = r5[r4]
            if (r6 == r5) goto L_0x0172
            java.lang.String r4 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()
            byte[] r4 = r4.getBytes(r5)
            r5 = r1
        L_0x002a:
            int r6 = r4.length
            if (r5 >= r6) goto L_0x016f
            byte r6 = r3[r5]
            byte r8 = r4[r5]
            if (r6 == r8) goto L_0x016b
            q25 r6 = new q25     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            r6.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00ae, all -> 0x00ab }
            int r8 = r6.readInt()     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            long r8 = (long) r8     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            byte[] r10 = new byte[r7]     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            r6.read(r10)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            byte[] r11 = x     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            boolean r10 = java.util.Arrays.equals(r10, r11)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r10 != 0) goto L_0x004f
        L_0x004a:
            r6.close()
            goto L_0x00b9
        L_0x004f:
            r10 = 1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r13 = 8
            if (r12 != 0) goto L_0x0065
            long r8 = r6.readLong()     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            r15 = 16
            int r12 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r12 >= 0) goto L_0x0066
            goto L_0x004a
        L_0x0062:
            r0 = move-exception
            r5 = r6
            goto L_0x00b0
        L_0x0065:
            r15 = r13
        L_0x0066:
            long r4 = (long) r2     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x006c
            r8 = r4
        L_0x006c:
            long r8 = r8 - r15
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0072
            goto L_0x004a
        L_0x0072:
            byte[] r2 = new byte[r7]     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            r4 = 0
            r13 = r1
            r14 = r13
        L_0x0078:
            r15 = 4
            long r15 = r8 / r15
            int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x004a
            int r15 = r6.read(r2)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r15 == r7) goto L_0x0087
            goto L_0x004a
        L_0x0087:
            int r15 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r15 != 0) goto L_0x008c
            goto L_0x00a9
        L_0x008c:
            byte[] r15 = y     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            boolean r15 = java.util.Arrays.equals(r2, r15)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r15 == 0) goto L_0x0096
            r13 = 1
            goto L_0x009f
        L_0x0096:
            byte[] r15 = z     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            boolean r15 = java.util.Arrays.equals(r2, r15)     // Catch:{ Exception -> 0x00b6, all -> 0x0062 }
            if (r15 == 0) goto L_0x009f
            r14 = 1
        L_0x009f:
            if (r13 == 0) goto L_0x00a9
            if (r14 == 0) goto L_0x00a9
            r6.close()
            r0 = 12
            return r0
        L_0x00a9:
            long r4 = r4 + r10
            goto L_0x0078
        L_0x00ab:
            r0 = move-exception
            r5 = 0
            goto L_0x00b0
        L_0x00ae:
            r6 = 0
            goto L_0x00b6
        L_0x00b0:
            if (r5 == 0) goto L_0x00b5
            r5.close()
        L_0x00b5:
            throw r0
        L_0x00b6:
            if (r6 == 0) goto L_0x00b9
            goto L_0x004a
        L_0x00b9:
            q25 r2 = new q25     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00e0, all -> 0x00dd }
            java.nio.ByteOrder r4 = w(r2)     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            r0.g = r4     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            r2.b = r4     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x00e8, all -> 0x00da }
            r5 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r5) goto L_0x00d5
            r5 = 21330(0x5352, float:2.989E-41)
            if (r4 != r5) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r4 = r1
            goto L_0x00d6
        L_0x00d5:
            r4 = 1
        L_0x00d6:
            r2.close()
            goto L_0x00ee
        L_0x00da:
            r0 = move-exception
            r5 = r2
            goto L_0x00e2
        L_0x00dd:
            r0 = move-exception
            r5 = 0
            goto L_0x00e2
        L_0x00e0:
            r2 = 0
            goto L_0x00e8
        L_0x00e2:
            if (r5 == 0) goto L_0x00e7
            r5.close()
        L_0x00e7:
            throw r0
        L_0x00e8:
            if (r2 == 0) goto L_0x00ed
            r2.close()
        L_0x00ed:
            r4 = r1
        L_0x00ee:
            if (r4 == 0) goto L_0x00f2
            r0 = 7
            return r0
        L_0x00f2:
            q25 r2 = new q25     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            java.nio.ByteOrder r4 = w(r2)     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            r0.g = r4     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            r2.b = r4     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0111, all -> 0x010e }
            r4 = 85
            if (r0 != r4) goto L_0x0109
            r0 = 1
            goto L_0x010a
        L_0x0109:
            r0 = r1
        L_0x010a:
            r2.close()
            goto L_0x0124
        L_0x010e:
            r0 = move-exception
            r5 = r2
            goto L_0x0118
        L_0x0111:
            r5 = r2
            goto L_0x011e
        L_0x0113:
            r0 = move-exception
            r5 = 0
            goto L_0x0118
        L_0x0116:
            r5 = 0
            goto L_0x011e
        L_0x0118:
            if (r5 == 0) goto L_0x011d
            r5.close()
        L_0x011d:
            throw r0
        L_0x011e:
            if (r5 == 0) goto L_0x0123
            r5.close()
        L_0x0123:
            r0 = r1
        L_0x0124:
            if (r0 == 0) goto L_0x0129
            r0 = 10
            return r0
        L_0x0129:
            r0 = r1
        L_0x012a:
            byte[] r2 = C
            int r4 = r2.length
            if (r0 >= r4) goto L_0x013a
            byte r4 = r3[r0]
            byte r2 = r2[r0]
            if (r4 == r2) goto L_0x0137
            r0 = r1
            goto L_0x013b
        L_0x0137:
            int r0 = r0 + 1
            goto L_0x012a
        L_0x013a:
            r0 = 1
        L_0x013b:
            if (r0 == 0) goto L_0x0140
            r0 = 13
            return r0
        L_0x0140:
            r0 = r1
        L_0x0141:
            byte[] r2 = G
            int r4 = r2.length
            if (r0 >= r4) goto L_0x0151
            byte r4 = r3[r0]
            byte r2 = r2[r0]
            if (r4 == r2) goto L_0x014e
        L_0x014c:
            r4 = r1
            goto L_0x0165
        L_0x014e:
            int r0 = r0 + 1
            goto L_0x0141
        L_0x0151:
            r0 = r1
        L_0x0152:
            byte[] r4 = H
            int r5 = r4.length
            if (r0 >= r5) goto L_0x0164
            int r5 = r2.length
            int r5 = r5 + r0
            int r5 = r5 + r7
            byte r5 = r3[r5]
            byte r4 = r4[r0]
            if (r5 == r4) goto L_0x0161
            goto L_0x014c
        L_0x0161:
            int r0 = r0 + 1
            goto L_0x0152
        L_0x0164:
            r4 = 1
        L_0x0165:
            if (r4 == 0) goto L_0x016a
            r0 = 14
            return r0
        L_0x016a:
            return r1
        L_0x016b:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x016f:
            r0 = 9
            return r0
        L_0x0172:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0176:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.i(java.io.BufferedInputStream):int");
    }

    public final void j(u25 u25) {
        int i2;
        int i3;
        m(u25);
        HashMap[] hashMapArr = this.e;
        r25 r25 = (r25) hashMapArr[1].get("MakerNote");
        if (r25 != null) {
            u25 u252 = new u25(r25.d);
            u252.b = this.g;
            byte[] bArr = A;
            byte[] bArr2 = new byte[bArr.length];
            u252.readFully(bArr2);
            u252.d(0);
            byte[] bArr3 = B;
            byte[] bArr4 = new byte[bArr3.length];
            u252.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                u252.d(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                u252.d(12);
            }
            y(u252, 6);
            r25 r252 = (r25) hashMapArr[7].get("PreviewImageStart");
            r25 r253 = (r25) hashMapArr[7].get("PreviewImageLength");
            if (!(r252 == null || r253 == null)) {
                hashMapArr[5].put("JPEGInterchangeFormat", r252);
                hashMapArr[5].put("JPEGInterchangeFormatLength", r253);
            }
            r25 r254 = (r25) hashMapArr[8].get("AspectFrame");
            if (r254 != null) {
                int[] iArr = (int[]) r254.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 > i5 && (i2 = iArr[3]) > (i3 = iArr[1])) {
                    int i6 = (i4 - i5) + 1;
                    int i7 = (i2 - i3) + 1;
                    if (i6 < i7) {
                        int i8 = i6 + i7;
                        i7 = i8 - i7;
                        i6 = i8 - i7;
                    }
                    r25 e2 = r25.e(i6, this.g);
                    r25 e3 = r25.e(i7, this.g);
                    hashMapArr[0].put("ImageWidth", e2);
                    hashMapArr[0].put("ImageLength", e3);
                }
            }
        }
    }

    public final void k(q25 q25) {
        if (t) {
            Objects.toString(q25);
        }
        q25.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = C;
        q25.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = q25.readInt();
                byte[] bArr2 = new byte[4];
                if (q25.read(bArr2) == 4) {
                    int i2 = length + 8;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, E)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, F)) {
                        if (Arrays.equals(bArr2, D)) {
                            byte[] bArr3 = new byte[readInt];
                            if (q25.read(bArr3) == readInt) {
                                int readInt2 = q25.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.o = i2;
                                    x(0, bArr3);
                                    J();
                                    G(new q25(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + pfa.b(bArr2));
                        }
                        int i3 = readInt + 4;
                        q25.a(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void l(q25 q25) {
        if (t) {
            Objects.toString(q25);
        }
        q25.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        q25.read(bArr);
        q25.read(bArr2);
        q25.read(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        q25.a(i2 - q25.c);
        q25.read(bArr4);
        h(new q25(bArr4), i2, 5);
        q25.a(i4 - q25.c);
        q25.b = ByteOrder.BIG_ENDIAN;
        int readInt = q25.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = q25.readUnsignedShort();
            int readUnsignedShort2 = q25.readUnsignedShort();
            if (readUnsignedShort == S.a) {
                short readShort = q25.readShort();
                short readShort2 = q25.readShort();
                r25 e2 = r25.e(readShort, this.g);
                r25 e3 = r25.e(readShort2, this.g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", e2);
                hashMapArr[0].put("ImageWidth", e3);
                return;
            }
            q25.a(readUnsignedShort2);
        }
    }

    public final void m(u25 u25) {
        u(u25);
        y(u25, 0);
        I(u25, 0);
        I(u25, 5);
        I(u25, 4);
        J();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.e;
            r25 r25 = (r25) hashMapArr[1].get("MakerNote");
            if (r25 != null) {
                u25 u252 = new u25(r25.d);
                u252.b = this.g;
                u252.a(6);
                y(u252, 9);
                r25 r252 = (r25) hashMapArr[9].get("ColorSpace");
                if (r252 != null) {
                    hashMapArr[1].put("ColorSpace", r252);
                }
            }
        }
    }

    public final void n(u25 u25) {
        if (t) {
            Objects.toString(u25);
        }
        m(u25);
        HashMap[] hashMapArr = this.e;
        r25 r25 = (r25) hashMapArr[0].get("JpgFromRaw");
        if (r25 != null) {
            h(new q25(r25.d), (int) r25.c, 5);
        }
        r25 r252 = (r25) hashMapArr[0].get("ISO");
        r25 r253 = (r25) hashMapArr[1].get("PhotographicSensitivity");
        if (r252 != null && r253 == null) {
            hashMapArr[1].put("PhotographicSensitivity", r252);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063 A[SYNTHETIC, Splitter:B:37:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0082 A[Catch:{ Exception -> 0x0097, all -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0093 A[SYNTHETIC, Splitter:B:59:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x009c A[SYNTHETIC, Splitter:B:66:0x009c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] o() {
        /*
            r8 = this;
            boolean r0 = r8.h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            byte[] r0 = r8.m
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.res.AssetManager$AssetInputStream r0 = r8.c     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            if (r0 == 0) goto L_0x0026
            boolean r2 = r0.markSupported()     // Catch:{ Exception -> 0x001f, all -> 0x001a }
            if (r2 == 0) goto L_0x0022
            r0.reset()     // Catch:{ Exception -> 0x001f, all -> 0x001a }
        L_0x0018:
            r2 = r1
            goto L_0x004d
        L_0x001a:
            r8 = move-exception
            r2 = r1
        L_0x001c:
            r1 = r0
            goto L_0x008e
        L_0x001f:
            r2 = r1
            goto L_0x0097
        L_0x0022:
            defpackage.pfa.e(r0)
            return r1
        L_0x0026:
            java.lang.String r0 = r8.a     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            if (r0 == 0) goto L_0x0038
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            java.lang.String r2 = r8.a     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            goto L_0x0018
        L_0x0032:
            r8 = move-exception
            r2 = r1
            goto L_0x008e
        L_0x0035:
            r0 = r1
            r2 = r0
            goto L_0x0097
        L_0x0038:
            java.io.FileDescriptor r0 = r8.b     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            java.io.FileDescriptor r0 = defpackage.w25.b(r0)     // Catch:{ Exception -> 0x0035, all -> 0x0032 }
            int r2 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r3 = 0
            defpackage.w25.c(r0, r3, r2)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0088 }
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x004d:
            int r3 = r8.k     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r4 = r8.o     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            long r3 = r0.skip(r3)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r5 = r8.k     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r6 = r8.o     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r5 = r5 + r6
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            java.lang.String r4 = "Corrupted image"
            if (r3 != 0) goto L_0x0082
            int r3 = r8.l     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r5 = r0.read(r3)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            int r6 = r8.l     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            if (r5 != r6) goto L_0x007c
            r8.m = r3     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            defpackage.pfa.e(r0)
            if (r2 == 0) goto L_0x0079
            defpackage.w25.a(r2)     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            return r3
        L_0x007a:
            r8 = move-exception
            goto L_0x001c
        L_0x007c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            throw r8     // Catch:{ Exception -> 0x0097, all -> 0x007a }
        L_0x0082:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0097, all -> 0x007a }
            throw r8     // Catch:{ Exception -> 0x0097, all -> 0x007a }
        L_0x0088:
            r8 = move-exception
            r2 = r0
            goto L_0x008e
        L_0x008b:
            r2 = r0
            r0 = r1
            goto L_0x0097
        L_0x008e:
            defpackage.pfa.e(r1)
            if (r2 == 0) goto L_0x0096
            defpackage.w25.a(r2)     // Catch:{ Exception -> 0x0096 }
        L_0x0096:
            throw r8
        L_0x0097:
            defpackage.pfa.e(r0)
            if (r2 == 0) goto L_0x009f
            defpackage.w25.a(r2)     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.o():byte[]");
    }

    public final void p(q25 q25) {
        if (t) {
            Objects.toString(q25);
        }
        q25.b = ByteOrder.LITTLE_ENDIAN;
        q25.a(G.length);
        int readInt = q25.readInt() + 8;
        byte[] bArr = H;
        q25.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (q25.read(bArr2) == 4) {
                    int readInt2 = q25.readInt();
                    int i2 = length + 8;
                    if (Arrays.equals(I, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (q25.read(bArr3) == readInt2) {
                            this.o = i2;
                            x(0, bArr3);
                            G(new q25(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + pfa.b(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i2 + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            q25.a(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void r(q25 q25, HashMap hashMap) {
        r25 r25 = (r25) hashMap.get("JPEGInterchangeFormat");
        r25 r252 = (r25) hashMap.get("JPEGInterchangeFormatLength");
        if (r25 != null && r252 != null) {
            int h2 = r25.h(this.g);
            int h3 = r252.h(this.g);
            if (this.d == 7) {
                h2 += this.p;
            }
            if (h2 > 0 && h3 > 0) {
                this.h = true;
                if (this.a == null && this.c == null && this.b == null) {
                    byte[] bArr = new byte[h3];
                    q25.skip((long) h2);
                    q25.read(bArr);
                    this.m = bArr;
                }
                this.k = h2;
                this.l = h3;
            }
        }
    }

    public final boolean s(HashMap hashMap) {
        r25 r25 = (r25) hashMap.get("ImageLength");
        r25 r252 = (r25) hashMap.get("ImageWidth");
        if (r25 == null || r252 == null) {
            return false;
        }
        return r25.h(this.g) <= 512 && r252.h(this.g) <= 512;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = t
            r1 = 0
            r2 = r1
        L_0x0004:
            s25[][] r3 = T     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r3 = r3.length     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            if (r2 >= r3) goto L_0x0018
            java.util.HashMap[] r3 = r7.e     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r4.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r3[r2] = r4     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0015:
            r8 = move-exception
            goto L_0x0087
        L_0x0018:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r8 = r7.i(r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r7.d = r8     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L_0x0060
            if (r8 == r5) goto L_0x0060
            if (r8 == r4) goto L_0x0060
            if (r8 != r3) goto L_0x0035
            goto L_0x0060
        L_0x0035:
            u25 r8 = new u25     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r8.<init>((java.io.InputStream) r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r1 = r7.d     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r2 = 12
            if (r1 != r2) goto L_0x0044
            r7.g(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x0056
        L_0x0044:
            r2 = 7
            if (r1 != r2) goto L_0x004b
            r7.j(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x0056
        L_0x004b:
            r2 = 10
            if (r1 != r2) goto L_0x0053
            r7.n(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x0056
        L_0x0053:
            r7.m(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
        L_0x0056:
            int r1 = r7.o     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            long r1 = (long) r1     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r8.d(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r7.G(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x0060:
            q25 r8 = new q25     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            r8.<init>((java.io.InputStream) r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            int r2 = r7.d     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            if (r2 != r6) goto L_0x006d
            r7.h(r8, r1, r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x006d:
            if (r2 != r4) goto L_0x0073
            r7.k(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x0073:
            if (r2 != r5) goto L_0x0079
            r7.l(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
            goto L_0x007e
        L_0x0079:
            if (r2 != r3) goto L_0x007e
            r7.p(r8)     // Catch:{ IOException | UnsupportedOperationException -> 0x0090, all -> 0x0015 }
        L_0x007e:
            r7.a()
            if (r0 == 0) goto L_0x0096
        L_0x0083:
            r7.v()
            goto L_0x0096
        L_0x0087:
            r7.a()
            if (r0 == 0) goto L_0x008f
            r7.v()
        L_0x008f:
            throw r8
        L_0x0090:
            r7.a()
            if (r0 == 0) goto L_0x0096
            goto L_0x0083
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.t(java.io.InputStream):void");
    }

    public final void u(q25 q25) {
        ByteOrder w2 = w(q25);
        this.g = w2;
        q25.b = w2;
        int readUnsignedShort = q25.readUnsignedShort();
        int i2 = this.d;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = q25.readInt();
            if (readInt >= 8) {
                int i3 = readInt - 8;
                if (i3 > 0) {
                    q25.a(i3);
                    return;
                }
                return;
            }
            throw new IOException(wn6.h(readInt, "Invalid first Ifd offset: "));
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void v() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i2 < hashMapArr.length) {
                hashMapArr[i2].size();
                for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                    r25 r25 = (r25) entry.getValue();
                    String str = (String) entry.getKey();
                    r25.toString();
                    r25.i(this.g);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void x(int i2, byte[] bArr) {
        u25 u25 = new u25(bArr);
        u(u25);
        y(u25, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(defpackage.u25 r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            int r3 = r1.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r4 = r0.f
            r4.add(r3)
            short r3 = r27.readShort()
            if (r3 > 0) goto L_0x0018
            return
        L_0x0018:
            r6 = 0
        L_0x0019:
            boolean r7 = t
            java.util.HashMap[] r10 = r0.e
            if (r6 >= r3) goto L_0x0235
            int r12 = r27.readUnsignedShort()
            int r13 = r27.readUnsignedShort()
            int r15 = r27.readInt()
            int r14 = r1.c
            r20 = r6
            long r5 = (long) r14
            r16 = 4
            long r5 = r5 + r16
            java.util.HashMap[] r14 = V
            r14 = r14[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            java.lang.Object r8 = r14.get(r8)
            s25 r8 = (defpackage.s25) r8
            if (r7 == 0) goto L_0x0069
            java.lang.Integer r9 = java.lang.Integer.valueOf(r28)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            if (r8 == 0) goto L_0x0053
            java.lang.String r11 = r8.b
        L_0x0050:
            r21 = r3
            goto L_0x0055
        L_0x0053:
            r11 = 0
            goto L_0x0050
        L_0x0055:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r22 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r14, r11, r3, r4}
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r4, r3)
            goto L_0x006d
        L_0x0069:
            r21 = r3
            r22 = r4
        L_0x006d:
            r9 = 3
            r11 = 7
            if (r8 != 0) goto L_0x0075
        L_0x0071:
            r23 = r10
            goto L_0x00cf
        L_0x0075:
            if (r13 <= 0) goto L_0x0071
            int[] r14 = Q
            int r4 = r14.length
            if (r13 < r4) goto L_0x007d
            goto L_0x0071
        L_0x007d:
            int r4 = r8.c
            if (r4 == r11) goto L_0x0096
            if (r13 != r11) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            if (r4 == r13) goto L_0x0096
            int r11 = r8.d
            if (r11 != r13) goto L_0x008b
            goto L_0x0096
        L_0x008b:
            r3 = 4
            if (r4 == r3) goto L_0x0094
            if (r11 != r3) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r3 = 9
            goto L_0x0098
        L_0x0094:
            if (r13 != r9) goto L_0x0091
        L_0x0096:
            r3 = 7
            goto L_0x00b3
        L_0x0098:
            if (r4 == r3) goto L_0x009c
            if (r11 != r3) goto L_0x00a1
        L_0x009c:
            r3 = 8
            if (r13 != r3) goto L_0x00a1
            goto L_0x0096
        L_0x00a1:
            r3 = 12
            if (r4 == r3) goto L_0x00a7
            if (r11 != r3) goto L_0x00ac
        L_0x00a7:
            r3 = 11
            if (r13 != r3) goto L_0x00ac
            goto L_0x0096
        L_0x00ac:
            if (r7 == 0) goto L_0x0071
            java.lang.String[] r3 = P
            r3 = r3[r13]
            goto L_0x0071
        L_0x00b3:
            if (r13 != r3) goto L_0x00b6
            r13 = r4
        L_0x00b6:
            long r3 = (long) r15
            r11 = r14[r13]
            r23 = r10
            long r9 = (long) r11
            long r3 = r3 * r9
            r9 = 0
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00cd
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            r9 = 1
            goto L_0x00d2
        L_0x00cd:
            r9 = 0
            goto L_0x00d2
        L_0x00cf:
            r3 = 0
            goto L_0x00cd
        L_0x00d2:
            if (r9 != 0) goto L_0x00db
            r1.d(r5)
            r9 = r22
            goto L_0x022b
        L_0x00db:
            int r9 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            java.lang.String r10 = "Compression"
            if (r9 <= 0) goto L_0x0142
            int r9 = r27.readInt()
            int r11 = r0.d
            r14 = 7
            if (r11 != r14) goto L_0x00f6
            java.lang.String r11 = r8.b
            java.lang.String r14 = "MakerNote"
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00fb
            r0.p = r9
        L_0x00f6:
            r24 = r3
            r16 = r15
            goto L_0x013d
        L_0x00fb:
            r11 = 6
            if (r2 != r11) goto L_0x00f6
            java.lang.String r14 = "ThumbnailImage"
            java.lang.String r11 = r8.b
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00f6
            r0.q = r9
            r0.r = r15
            java.nio.ByteOrder r11 = r0.g
            r14 = 6
            r25 r11 = defpackage.r25.e(r14, r11)
            int r14 = r0.q
            r16 = r15
            long r14 = (long) r14
            java.nio.ByteOrder r2 = r0.g
            r25 r2 = defpackage.r25.b(r14, r2)
            int r14 = r0.r
            long r14 = (long) r14
            r24 = r3
            java.nio.ByteOrder r3 = r0.g
            r25 r3 = defpackage.r25.b(r14, r3)
            r4 = 4
            r14 = r23[r4]
            r14.put(r10, r11)
            r11 = r23[r4]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r11.put(r14, r2)
            r2 = r23[r4]
            java.lang.String r4 = "JPEGInterchangeFormatLength"
            r2.put(r4, r3)
        L_0x013d:
            long r2 = (long) r9
            r1.d(r2)
            goto L_0x0146
        L_0x0142:
            r24 = r3
            r16 = r15
        L_0x0146:
            java.util.HashMap r2 = Y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x01bb
            r3 = 3
            if (r13 == r3) goto L_0x0180
            r3 = 4
            if (r13 == r3) goto L_0x0174
            r3 = 8
            if (r13 == r3) goto L_0x016f
            r3 = 9
            if (r13 == r3) goto L_0x0169
            r3 = 13
            if (r13 == r3) goto L_0x0169
            r3 = -1
            goto L_0x0185
        L_0x0169:
            int r3 = r27.readInt()
        L_0x016d:
            long r3 = (long) r3
            goto L_0x0185
        L_0x016f:
            short r3 = r27.readShort()
            goto L_0x016d
        L_0x0174:
            int r3 = r27.readInt()
            long r3 = (long) r3
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r9
            goto L_0x0185
        L_0x0180:
            int r3 = r27.readUnsignedShort()
            goto L_0x016d
        L_0x0185:
            if (r7 == 0) goto L_0x0196
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r8 = r8.b
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}
            java.lang.String r8 = "Offset: %d, tagName: %s"
            java.lang.String.format(r8, r7)
        L_0x0196:
            r7 = 0
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x01b4
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = r22
            boolean r7 = r9.contains(r7)
            if (r7 != 0) goto L_0x01b6
            r1.d(r3)
            int r2 = r2.intValue()
            r0.y(r1, r2)
            goto L_0x01b6
        L_0x01b4:
            r9 = r22
        L_0x01b6:
            r1.d(r5)
            goto L_0x022b
        L_0x01bb:
            r9 = r22
            int r2 = r1.c
            int r3 = r0.o
            int r2 = r2 + r3
            r3 = r24
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            r25 r4 = new r25
            long r11 = (long) r2
            r14 = r4
            r2 = r16
            r15 = r11
            r17 = r3
            r18 = r13
            r19 = r2
            r14.<init>(r15, r17, r18, r19)
            r2 = r23[r28]
            java.lang.String r3 = r8.b
            r2.put(r3, r4)
            java.lang.String r2 = "DNGVersion"
            java.lang.String r3 = r8.b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ee
            r2 = 3
            r0.d = r2
        L_0x01ee:
            java.lang.String r2 = "Make"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x01fe
            java.lang.String r2 = "Model"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x020c
        L_0x01fe:
            java.nio.ByteOrder r2 = r0.g
            java.lang.String r2 = r4.i(r2)
            java.lang.String r7 = "PENTAX"
            boolean r2 = r2.contains(r7)
            if (r2 != 0) goto L_0x021d
        L_0x020c:
            boolean r2 = r10.equals(r3)
            if (r2 == 0) goto L_0x0221
            java.nio.ByteOrder r2 = r0.g
            int r2 = r4.h(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0221
        L_0x021d:
            r2 = 8
            r0.d = r2
        L_0x0221:
            int r2 = r1.c
            long r2 = (long) r2
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x022b
            r1.d(r5)
        L_0x022b:
            int r6 = r20 + 1
            short r6 = (short) r6
            r2 = r28
            r4 = r9
            r3 = r21
            goto L_0x0019
        L_0x0235:
            r9 = r4
            r23 = r10
            int r2 = r27.readInt()
            if (r7 == 0) goto L_0x024b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "nextIfdOffset: %d"
            java.lang.String.format(r4, r3)
        L_0x024b:
            long r3 = (long) r2
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0278
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r9.contains(r2)
            if (r2 != 0) goto L_0x0278
            r1.d(r3)
            r2 = 4
            r3 = r23[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x026c
            r0.y(r1, r2)
            goto L_0x0278
        L_0x026c:
            r2 = 5
            r3 = r23[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0278
            r0.y(r1, r2)
        L_0x0278:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.y(u25, int):void");
    }

    public final void z(String str) {
        for (int i2 = 0; i2 < T.length; i2++) {
            this.e[i2].remove(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052 A[SYNTHETIC, Splitter:B:28:0x0052] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v25(java.io.FileDescriptor r5) {
        /*
            r4 = this;
            r4.<init>()
            s25[][] r0 = T
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r4.e = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r4.f = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.g = r0
            if (r5 == 0) goto L_0x0056
            r0 = 0
            r4.c = r0
            r4.a = r0
            int r1 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0035 }
            r2 = 0
            defpackage.w25.c(r5, r2, r1)     // Catch:{ Exception -> 0x0035 }
            r4.b = r5
            java.io.FileDescriptor r5 = defpackage.w25.b(r5)     // Catch:{ Exception -> 0x002c }
            r1 = 1
            goto L_0x0038
        L_0x002c:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "Failed to duplicate file descriptor"
            r5.<init>(r0, r4)
            throw r5
        L_0x0035:
            r4.b = r0
            r1 = 0
        L_0x0038:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004c }
            r2.<init>(r5)     // Catch:{ all -> 0x004c }
            r4.t(r2)     // Catch:{ all -> 0x0049 }
            defpackage.pfa.e(r2)
            if (r1 == 0) goto L_0x0048
            defpackage.w25.a(r5)     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            return
        L_0x0049:
            r4 = move-exception
            r0 = r2
            goto L_0x004d
        L_0x004c:
            r4 = move-exception
        L_0x004d:
            defpackage.pfa.e(r0)
            if (r1 == 0) goto L_0x0055
            defpackage.w25.a(r5)     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            throw r4
        L_0x0056:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "fileDescriptor cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v25.<init>(java.io.FileDescriptor):void");
    }

    public v25(InputStream inputStream) {
        s25[][] s25Arr = T;
        this.e = new HashMap[s25Arr.length];
        this.f = new HashSet(s25Arr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    w25.c(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                    this.c = null;
                    this.b = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.c = null;
            this.b = null;
        }
        t(inputStream);
    }
}
