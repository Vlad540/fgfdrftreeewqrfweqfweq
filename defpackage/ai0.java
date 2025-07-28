package defpackage;

/* renamed from: ai0  reason: default package */
public final /* synthetic */ class ai0 implements rf3 {
    public final /* synthetic */ int a;

    public /* synthetic */ ai0(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b3, code lost:
        if (r10.toLowerCase(r5).startsWith("td1a") == false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02da, code lost:
        if (r8.toLowerCase(r5).startsWith("tp1a") == false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f2, code lost:
        if ((android.os.Build.VERSION.SDK_INT == 33) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0308, code lost:
        if ((android.os.Build.VERSION.SDK_INT == 33) != false) goto L_0x030d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.Object r13) {
        /*
            r12 = this;
            alb r13 = (alb) r13
            xe6 r12 = new xe6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.a
            java.lang.String r2 = android.os.Build.MODEL
            boolean r1 = r1.contains(r2)
            r3 = 1
            r4 = 0
            java.lang.String r5 = "Google"
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0021
            r1 = r3
            goto L_0x0022
        L_0x0021:
            r1 = r4
        L_0x0022:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk> r6 = androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.class
            boolean r1 = r13.a(r6, r1)
            if (r1 == 0) goto L_0x0032
            androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk
            r1.<init>()
            r0.add(r1)
        L_0x0032:
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.f()
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk> r6 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.class
            boolean r1 = r13.a(r6, r1)
            if (r1 == 0) goto L_0x0046
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r1 = new androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk
            r1.<init>()
            r0.add(r1)
        L_0x0046:
            int r1 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.a
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r6 = "GOOGLE"
            r6.equalsIgnoreCase(r1)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk> r6 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class
            boolean r6 = r13.a(r6, r4)
            if (r6 == 0) goto L_0x005f
            androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk r6 = new androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk
            r6.<init>()
            r0.add(r6)
        L_0x005f:
            java.lang.String r6 = "OnePlus"
            boolean r7 = r6.equalsIgnoreCase(r1)
            java.lang.String r8 = "SAMSUNG"
            if (r7 == 0) goto L_0x0074
            java.lang.String r7 = "OnePlus6"
            java.lang.String r9 = android.os.Build.DEVICE
            boolean r7 = r7.equalsIgnoreCase(r9)
            if (r7 == 0) goto L_0x0074
            goto L_0x00cc
        L_0x0074:
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x0085
            java.lang.String r6 = "OnePlus6T"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0085
            goto L_0x00cc
        L_0x0085:
            java.lang.String r6 = "HUAWEI"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x0098
            java.lang.String r6 = "HWANE"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0098
            goto L_0x00cc
        L_0x0098:
            boolean r6 = r8.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x00a9
            java.lang.String r6 = "ON7XELTE"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x00a9
            goto L_0x00cc
        L_0x00a9:
            boolean r6 = r8.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x00ba
            java.lang.String r6 = "J7XELTE"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x00ba
            goto L_0x00cc
        L_0x00ba:
            java.lang.String r6 = "REDMI"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L_0x00ce
            java.lang.String r6 = "joyeuse"
            java.lang.String r7 = android.os.Build.DEVICE
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x00ce
        L_0x00cc:
            r6 = r3
            goto L_0x00cf
        L_0x00ce:
            r6 = r4
        L_0x00cf:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.class
            boolean r6 = r13.a(r7, r6)
            if (r6 == 0) goto L_0x00df
            androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk r6 = new androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk
            r6.<init>()
            r0.add(r6)
        L_0x00df:
            java.util.List r6 = androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = r2.toUpperCase(r6)
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a
            boolean r7 = r9.contains(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class
            boolean r7 = r13.a(r9, r7)
            if (r7 == 0) goto L_0x00fd
            androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk
            r7.<init>()
            r0.add(r7)
        L_0x00fd:
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.a
            java.lang.String r7 = android.os.Build.MANUFACTURER
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x011b
            java.lang.String r5 = android.os.Build.DEVICE
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.toLowerCase(r9)
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.a
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x011b
            r5 = r3
            goto L_0x011c
        L_0x011b:
            r5 = r4
        L_0x011c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk.class
            boolean r5 = r13.a(r9, r5)
            if (r5 == 0) goto L_0x012c
            androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk
            r5.<init>()
            r0.add(r5)
        L_0x012c:
            java.lang.String r5 = r7.toUpperCase(r6)
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0144
            java.lang.String r5 = r2.toUpperCase(r6)
            java.lang.String r8 = "SM-A716"
            boolean r5 = r5.startsWith(r8)
            if (r5 == 0) goto L_0x0144
            r5 = r3
            goto L_0x0145
        L_0x0144:
            r5 = r4
        L_0x0145:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class
            boolean r5 = r13.a(r8, r5)
            if (r5 == 0) goto L_0x0155
            androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk
            r5.<init>()
            r0.add(r5)
        L_0x0155:
            i4e r5 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a
            java.lang.String r5 = android.os.Build.DEVICE
            java.lang.String r8 = "heroqltevzw"
            boolean r8 = r8.equalsIgnoreCase(r5)
            java.lang.String r9 = "google"
            if (r8 != 0) goto L_0x0189
            java.lang.String r8 = "heroqltetmo"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x016c
            goto L_0x0189
        L_0x016c:
            boolean r5 = r9.equalsIgnoreCase(r1)
            if (r5 != 0) goto L_0x0174
            r5 = r4
            goto L_0x017e
        L_0x0174:
            java.lang.String r5 = r2.toUpperCase(r6)
            java.util.HashSet r8 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.c
            boolean r5 = r8.contains(r5)
        L_0x017e:
            if (r5 != 0) goto L_0x0189
            boolean r5 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.e()
            if (r5 == 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r5 = r4
            goto L_0x018a
        L_0x0189:
            r5 = r3
        L_0x018a:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class
            boolean r5 = r13.a(r8, r5)
            if (r5 == 0) goto L_0x019a
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk
            r5.<init>()
            r0.add(r5)
        L_0x019a:
            java.util.HashSet r5 = androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.a
            android.util.Pair r8 = new android.util.Pair
            java.lang.String r7 = r7.toLowerCase(r6)
            java.lang.String r10 = r2.toLowerCase(r6)
            r8.<init>(r7, r10)
            boolean r5 = r5.contains(r8)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x01bd
            androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk
            r5.<init>()
            r0.add(r5)
        L_0x01bd:
            java.lang.String r5 = "Huawei"
            boolean r5 = r5.equalsIgnoreCase(r1)
            if (r5 == 0) goto L_0x01cf
            java.lang.String r5 = "mha-l29"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x01cf
            r5 = r3
            goto L_0x01d0
        L_0x01cf:
            r5 = r4
        L_0x01d0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x01e0
            androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk
            r5.<init>()
            r0.add(r5)
        L_0x01e0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk> r5 = androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk.class
            boolean r5 = r13.a(r5, r4)
            if (r5 == 0) goto L_0x01f0
            androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk
            r5.<init>()
            r0.add(r5)
        L_0x01f0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk> r5 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class
            boolean r5 = r13.a(r5, r4)
            if (r5 == 0) goto L_0x0200
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk
            r5.<init>()
            r0.add(r5)
        L_0x0200:
            java.util.List r5 = androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.a
            java.lang.String r5 = r2.toLowerCase(r6)
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.a
            boolean r5 = r7.contains(r5)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x021c
            androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk
            r5.<init>()
            r0.add(r5)
        L_0x021c:
            java.util.List r5 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.a
            java.lang.String r5 = "samsung"
            boolean r7 = r5.equalsIgnoreCase(r1)
            java.lang.String r8 = "xiaomi"
            if (r7 == 0) goto L_0x0231
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.a
            boolean r7 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.e(r7)
            if (r7 == 0) goto L_0x0231
            goto L_0x023f
        L_0x0231:
            boolean r7 = r8.equalsIgnoreCase(r1)
            if (r7 == 0) goto L_0x0241
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.b
            boolean r7 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.e(r7)
            if (r7 == 0) goto L_0x0241
        L_0x023f:
            r7 = r3
            goto L_0x0242
        L_0x0241:
            r7 = r4
        L_0x0242:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.class
            boolean r7 = r13.a(r10, r7)
            if (r7 == 0) goto L_0x0252
            androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk
            r7.<init>()
            r0.add(r7)
        L_0x0252:
            java.lang.String r7 = "motorola"
            boolean r7 = r7.equalsIgnoreCase(r1)
            if (r7 == 0) goto L_0x0264
            java.lang.String r7 = "moto e5 play"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0264
            r7 = r3
            goto L_0x0265
        L_0x0264:
            r7 = r4
        L_0x0265:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk> r10 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk.class
            boolean r7 = r13.a(r10, r7)
            if (r7 == 0) goto L_0x0275
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk
            r7.<init>()
            r0.add(r7)
        L_0x0275:
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.a
            boolean r5 = r5.equalsIgnoreCase(r1)
            java.lang.String r7 = "tp1a"
            if (r5 == 0) goto L_0x028f
            java.lang.String r5 = android.os.Build.ID
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r10)
            boolean r5 = r5.startsWith(r7)
            if (r5 == 0) goto L_0x028f
            goto L_0x030d
        L_0x028f:
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r10 = r2.toLowerCase(r5)
            java.util.List r11 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.a
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto L_0x02b6
            java.lang.String r10 = android.os.Build.ID
            java.lang.String r11 = r10.toLowerCase(r5)
            boolean r11 = r11.startsWith(r7)
            if (r11 != 0) goto L_0x030d
            java.lang.String r10 = r10.toLowerCase(r5)
            java.lang.String r11 = "td1a"
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x02b6
            goto L_0x030d
        L_0x02b6:
            java.lang.String r10 = "redmi"
            boolean r10 = r10.equalsIgnoreCase(r1)
            if (r10 != 0) goto L_0x02c4
            boolean r8 = r8.equalsIgnoreCase(r1)
            if (r8 == 0) goto L_0x02dd
        L_0x02c4:
            java.lang.String r8 = android.os.Build.ID
            java.lang.String r10 = r8.toLowerCase(r5)
            java.lang.String r11 = "tkq1"
            boolean r10 = r10.startsWith(r11)
            if (r10 != 0) goto L_0x030d
            java.lang.String r8 = r8.toLowerCase(r5)
            boolean r7 = r8.startsWith(r7)
            if (r7 == 0) goto L_0x02dd
            goto L_0x030d
        L_0x02dd:
            java.lang.String r7 = r2.toLowerCase(r5)
            java.util.List r8 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.b
            boolean r7 = r8.contains(r7)
            r8 = 33
            if (r7 == 0) goto L_0x02f5
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 != r8) goto L_0x02f1
            r7 = r3
            goto L_0x02f2
        L_0x02f1:
            r7 = r4
        L_0x02f2:
            if (r7 == 0) goto L_0x02f5
            goto L_0x030d
        L_0x02f5:
            java.lang.String r5 = r2.toLowerCase(r5)
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.c
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L_0x030b
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 != r8) goto L_0x0307
            r5 = r3
            goto L_0x0308
        L_0x0307:
            r5 = r4
        L_0x0308:
            if (r5 == 0) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            r5 = r4
            goto L_0x030e
        L_0x030d:
            r5 = r3
        L_0x030e:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x031e
            androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk
            r5.<init>()
            r0.add(r5)
        L_0x031e:
            java.lang.String r5 = "samsungexynos7870"
            java.lang.String r7 = android.os.Build.HARDWARE
            boolean r5 = r5.equalsIgnoreCase(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk.class
            boolean r5 = r13.a(r7, r5)
            if (r5 == 0) goto L_0x0336
            androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk r5 = new androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk
            r5.<init>()
            r0.add(r5)
        L_0x0336:
            java.util.HashMap r5 = androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.a
            java.lang.String r2 = r2.toUpperCase(r6)
            boolean r2 = r5.containsKey(r2)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk> r5 = androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.class
            boolean r2 = r13.a(r5, r2)
            if (r2 == 0) goto L_0x0350
            androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk
            r2.<init>()
            r0.add(r2)
        L_0x0350:
            boolean r1 = r9.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x035d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L_0x035d
            goto L_0x035e
        L_0x035d:
            r3 = r4
        L_0x035e:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk> r1 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk.class
            boolean r13 = r13.a(r1, r3)
            if (r13 == 0) goto L_0x036e
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk r13 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk
            r13.<init>()
            r0.add(r13)
        L_0x036e:
            r12.<init>(r0)
            zf4.a = r12
            xe6 r12 = zf4.a
            xe6.o(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai0.a(java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [r5, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r1v31, types: [r5, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r7v10, types: [e1d, x0d] */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0320, code lost:
        if (androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.b.contains(p20.o().toLowerCase()) != false) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04e4, code lost:
        if (androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.a.contains(r1.toLowerCase(java.util.Locale.ROOT)) != false) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c8, code lost:
        if ("Q2Q".equalsIgnoreCase(r2) == false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01db, code lost:
        if ("OP4E75L1".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ee, code lost:
        if ("Q706F".equalsIgnoreCase(android.os.Build.DEVICE) != false) goto L_0x01f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05a5  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x05c2  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x05c4  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05ec  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x062a  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0761  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x077f  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0781  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x078a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r21) {
        /*
            r20 = this;
            java.lang.String r0 = "Samsung"
            java.lang.String r1 = "Vivo"
            java.lang.String r2 = "SAMSUNG"
            r3 = 0
            java.lang.String r4 = "vd9"
            r5 = -1
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = r20
            int r11 = r10.a
            switch(r11) {
                case 0: goto L_0x0a8a;
                case 1: goto L_0x0a81;
                case 2: goto L_0x0a6b;
                case 3: goto L_0x09dc;
                case 4: goto L_0x09d4;
                case 5: goto L_0x085b;
                case 6: goto L_0x0801;
                case 7: goto L_0x07cd;
                case 8: goto L_0x07ae;
                case 9: goto L_0x07a6;
                case 10: goto L_0x079d;
                case 11: goto L_0x063d;
                case 12: goto L_0x0233;
                case 13: goto L_0x019f;
                case 14: goto L_0x019b;
                case 15: goto L_0x0194;
                case 16: goto L_0x018d;
                case 17: goto L_0x0186;
                case 18: goto L_0x017e;
                case 19: goto L_0x0176;
                case 20: goto L_0x016e;
                case 21: goto L_0x015c;
                case 22: goto L_0x014a;
                case 23: goto L_0x012b;
                case 24: goto L_0x0123;
                case 25: goto L_0x011b;
                case 26: goto L_0x0113;
                case 27: goto L_0x010b;
                case 28: goto L_0x00f7;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = r21
            vd9 r0 = (defpackage.vd9) r0
            r0.getClass()
            java.lang.String r1 = "onQualityButtonClicked"
            udd.q(r4, r1)
            tk7 r1 = r0.X
            if (r1 != 0) goto L_0x002c
            java.lang.String r0 = "localMedia == null -> return"
            udd.q(r4, r0)
            goto L_0x00f6
        L_0x002c:
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x0039
            java.lang.String r0 = "localMedia is NOT video -> return"
            udd.q(r4, r0)
            goto L_0x00f6
        L_0x0039:
            ol7 r1 = r0.o
            boolean r1 = r1.a
            if (r1 != 0) goto L_0x0046
            java.lang.String r0 = "qualityButtonEnable == false -> return"
            udd.q(r4, r0)
            goto L_0x00f6
        L_0x0046:
            pn1 r1 = r0.G0
            boolean r1 = defpackage.tic.c(r1)
            if (r1 != 0) goto L_0x0055
            java.lang.String r0 = "initVideoLocalMediaDisposable is NOT disposed-> return"
            udd.q(r4, r0)
            goto L_0x00f6
        L_0x0055:
            f3f r1 = r0.x0
            g15 r2 = r0.D0
            if (r1 != 0) goto L_0x006e
            java.lang.String r0 = "videoConvertOptions == null -> return"
            udd.q(r4, r0)
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException
            java.lang.String r1 = "videoConvertOptions == null"
            r0.<init>(r1)
            r4a r2 = (r4a) r2
            r2.c(r0, r9)
            goto L_0x00f6
        L_0x006e:
            java.util.List r1 = r0.Z
            if (r1 != 0) goto L_0x0084
            java.lang.String r0 = "allowedQualities == null -> return"
            udd.q(r4, r0)
            ru.ok.tamtam.util.HandledException r0 = new ru.ok.tamtam.util.HandledException
            java.lang.String r1 = "allowedQualities == null"
            r0.<init>(r1)
            r4a r2 = (r4a) r2
            r2.c(r0, r9)
            goto L_0x00f6
        L_0x0084:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            f3f r2 = r0.x0
            float r3 = r2.c
            float r2 = r2.b
            float r3 = r3 - r2
            java.util.List r2 = r0.Z
            java.util.Iterator r2 = r2.iterator()
        L_0x0096:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00be
            java.lang.Object r4 = r2.next()
            rjb r4 = (defpackage.rjb) r4
            rjb r5 = new rjb
            qjb r11 = r4.a
            long r6 = r4.e
            float r6 = (float) r6
            float r6 = r6 * r3
            long r6 = (long) r6
            int r12 = r4.b
            boolean r8 = r4.f
            int r13 = r4.c
            int r14 = r4.d
            r10 = r5
            r15 = r6
            r17 = r8
            r10.<init>(r11, r12, r13, r14, r15, r17)
            r1.add(r5)
            goto L_0x0096
        L_0x00be:
            f3f r2 = r0.x0
            qjb r2 = r2.a
            nd9 r0 = r0.c
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = (ru.ok.messages.media.mediabar.ActLocalMedias) r0
            r0.getClass()
            ru.ok.messages.views.dialogs.VideoQualityPickerDialog r1 = ru.ok.messages.views.dialogs.VideoQualityPickerDialog.o1(r1, r2, r9)
            vx5 r2 = r0.P()
            java.lang.String r3 = "ru.ok.messages.media.mediabar.ActLocalMedias"
            r1.l1(r2, r3)
            vx5 r1 = r0.P()
            ru.ok.messages.media.mediabar.FrgLocalMedia r2 = r0.j0()
            nc7 r2 = r2.m0()
            g6 r3 = new g6
            r3.<init>(r0)
            qzf r0 = new qzf
            r0.<init>(r9)
            o2f r4 = new o2f
            r4.<init>(r0, r3, r9)
            java.lang.String r0 = "VideoQualityPickerDialog:result:request"
            r1.f0(r0, r2, r4)
        L_0x00f6:
            return
        L_0x00f7:
            r0 = r21
            vd9 r0 = (defpackage.vd9) r0
            r0.getClass()
            java.lang.String r1 = "onApplyClicked"
            udd.n(r4, r1)
            nd9 r0 = r0.c
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = (ru.ok.messages.media.mediabar.ActLocalMedias) r0
            r0.n0()
            return
        L_0x010b:
            r0 = r21
            kf9 r0 = (defpackage.kf9) r0
            r0.S0()
            return
        L_0x0113:
            r0 = r21
            kf9 r0 = (defpackage.kf9) r0
            r0.e1()
            return
        L_0x011b:
            r0 = r21
            kf9 r0 = (defpackage.kf9) r0
            r0.H1()
            return
        L_0x0123:
            r0 = r21
            kf9 r0 = (defpackage.kf9) r0
            r0.Z0()
            return
        L_0x012b:
            r0 = r21
            jd9 r0 = (defpackage.jd9) r0
            xz r0 = r0.c
            java.lang.Object r1 = r0.c
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            java.lang.Object r2 = r0.o
            qe9 r2 = (defpackage.qe9) r2
            java.lang.Object r0 = r0.b
            jwa r0 = (defpackage.jwa) r0
            r0.getClass()
            java.lang.Object r2 = r2.c     // Catch:{ Exception -> 0x0147 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ Exception -> 0x0147 }
            r1.removeView(r2)     // Catch:{ Exception -> 0x0147 }
        L_0x0147:
            r0.I0 = r3
            return
        L_0x014a:
            r0 = r21
            gd9 r0 = (defpackage.gd9) r0
            af9 r0 = r0.o
            if (r0 == 0) goto L_0x015b
            ai0 r1 = new ai0
            r2 = 7
            r1.<init>(r2)
            r0.o(r1)
        L_0x015b:
            return
        L_0x015c:
            r0 = r21
            gd9 r0 = (defpackage.gd9) r0
            af9 r0 = r0.o
            if (r0 == 0) goto L_0x016d
            ai0 r1 = new ai0
            r2 = 6
            r1.<init>(r2)
            r0.o(r1)
        L_0x016d:
            return
        L_0x016e:
            r0 = r21
            kf9 r0 = (defpackage.kf9) r0
            r0.g1()
            return
        L_0x0176:
            r0 = r21
            kf9 r0 = (defpackage.kf9) r0
            r0.W()
            return
        L_0x017e:
            r0 = r21
            kf9 r0 = (defpackage.kf9) r0
            r0.T()
            return
        L_0x0186:
            r0 = r21
            fm7 r0 = (defpackage.fm7) r0
            r0.a = r8
            return
        L_0x018d:
            r0 = r21
            fm7 r0 = (defpackage.fm7) r0
            r0.o = r5
            return
        L_0x0194:
            r0 = r21
            fm7 r0 = (defpackage.fm7) r0
            r0.d = r9
            return
        L_0x019b:
            r20.a(r21)
            return
        L_0x019f:
            r0 = r21
            alb r0 = (alb) r0
            xe6 r1 = new xe6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 >= r5) goto L_0x01f2
            java.lang.String r4 = android.os.Build.MANUFACTURER
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x01cb
            java.lang.String r2 = android.os.Build.DEVICE
            java.lang.String r5 = "F2Q"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 != 0) goto L_0x01f0
            java.lang.String r5 = "Q2Q"
            boolean r2 = r5.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x01cb
            goto L_0x01f0
        L_0x01cb:
            java.lang.String r2 = "OPPO"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x01de
            java.lang.String r2 = "OP4E75L1"
            java.lang.String r5 = android.os.Build.DEVICE
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L_0x01de
            goto L_0x01f0
        L_0x01de:
            java.lang.String r2 = "LENOVO"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x01f2
            java.lang.String r2 = "Q706F"
            java.lang.String r4 = android.os.Build.DEVICE
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x01f2
        L_0x01f0:
            r2 = r9
            goto L_0x01f3
        L_0x01f2:
            r2 = r8
        L_0x01f3:
            java.lang.Class<androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk> r4 = androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x0203
            androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk r2 = new androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk
            r2.<init>()
            r3.add(r2)
        L_0x0203:
            java.lang.String r2 = "XIAOMI"
            java.lang.String r4 = android.os.Build.MANUFACTURER
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x0218
            java.lang.String r2 = "M2101K7AG"
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L_0x0218
            r8 = r9
        L_0x0218:
            java.lang.Class<androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk> r2 = androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk.class
            boolean r0 = r0.a(r2, r8)
            if (r0 == 0) goto L_0x0228
            androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk r0 = new androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk
            r0.<init>()
            r3.add(r0)
        L_0x0228:
            r1.<init>(r3)
            yf4.a = r1
            xe6 r0 = yf4.a
            xe6.o(r0)
            return
        L_0x0233:
            r3 = r21
            alb r3 = (alb) r3
            xe6 r4 = new xe6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk> r6 = androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk.class
            boolean r6 = r3.a(r6, r8)
            if (r6 == 0) goto L_0x024e
            androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk r6 = new androidx.camera.video.internal.compat.quirk.MediaFormatMustNotUseFrameRateToFindEncoderQuirk
            r6.<init>()
            r5.add(r6)
        L_0x024e:
            java.util.List r6 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.a
            java.lang.String r6 = android.os.Build.BRAND
            java.lang.String r7 = "Nokia"
            boolean r10 = r7.equalsIgnoreCase(r6)
            java.lang.String r11 = "positivo"
            java.lang.String r12 = "twist 2 pro"
            java.lang.String r13 = "motorola"
            java.lang.String r14 = "moto c"
            java.lang.String r15 = "Nokia 1"
            if (r10 == 0) goto L_0x026e
            java.lang.String r10 = android.os.Build.MODEL
            boolean r10 = r15.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x026e
            goto L_0x02e9
        L_0x026e:
            boolean r10 = r13.equalsIgnoreCase(r6)
            if (r10 == 0) goto L_0x027e
            java.lang.String r10 = android.os.Build.MODEL
            boolean r10 = r14.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x027e
            goto L_0x02e9
        L_0x027e:
            java.lang.String r10 = "infinix"
            boolean r10 = r10.equalsIgnoreCase(r6)
            if (r10 == 0) goto L_0x0291
            java.lang.String r10 = "infinix x650"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r9 = r10.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0291
            goto L_0x02e9
        L_0x0291:
            java.lang.String r9 = "LGE"
            boolean r9 = r9.equalsIgnoreCase(r6)
            if (r9 == 0) goto L_0x02a4
            java.lang.String r9 = "LG-X230"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L_0x02a4
            goto L_0x02e9
        L_0x02a4:
            java.lang.String r9 = "Huawei"
            boolean r9 = r9.equalsIgnoreCase(r6)
            if (r9 == 0) goto L_0x02b7
            java.lang.String r9 = "mha-l29"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L_0x02b7
            goto L_0x02e9
        L_0x02b7:
            java.lang.String r9 = "Redmi"
            boolean r9 = r9.equalsIgnoreCase(r6)
            if (r9 == 0) goto L_0x02ca
            java.lang.String r9 = "Redmi Note 8 Pro"
            java.lang.String r10 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r10)
            if (r9 == 0) goto L_0x02ca
            goto L_0x02e9
        L_0x02ca:
            boolean r9 = r11.equalsIgnoreCase(r6)
            if (r9 == 0) goto L_0x02d9
            java.lang.String r9 = android.os.Build.MODEL
            boolean r9 = r12.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x02d9
            goto L_0x02e9
        L_0x02d9:
            java.lang.String r9 = android.os.Build.MODEL
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r9 = r9.toLowerCase(r10)
            java.util.List r10 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.a
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L_0x02eb
        L_0x02e9:
            r9 = 1
            goto L_0x02ec
        L_0x02eb:
            r9 = r8
        L_0x02ec:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk> r10 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.class
            boolean r9 = r3.a(r10, r9)
            if (r9 == 0) goto L_0x02fc
            androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk r9 = new androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk
            r9.<init>()
            r5.add(r9)
        L_0x02fc:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk> r9 = androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class
            boolean r9 = r3.a(r9, r8)
            if (r9 == 0) goto L_0x030c
            androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk r9 = new androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk
            r9.<init>()
            r5.add(r9)
        L_0x030c:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r9 < r10) goto L_0x0323
            java.util.HashSet r10 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.b
            java.lang.String r17 = p20.o()
            java.lang.String r8 = r17.toLowerCase()
            boolean r8 = r10.contains(r8)
            if (r8 == 0) goto L_0x0325
            goto L_0x0348
        L_0x0323:
            java.util.HashSet r8 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.a
        L_0x0325:
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x033a
            java.util.HashSet r2 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.a
            java.lang.String r8 = android.os.Build.HARDWARE
            java.lang.String r8 = r8.toLowerCase()
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L_0x033a
            goto L_0x0348
        L_0x033a:
            java.util.HashSet r2 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.c
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r8 = r8.toLowerCase()
            boolean r2 = r2.contains(r8)
            if (r2 == 0) goto L_0x034a
        L_0x0348:
            r2 = 1
            goto L_0x034b
        L_0x034a:
            r2 = 0
        L_0x034b:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk> r8 = androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk.class
            boolean r2 = r3.a(r8, r2)
            if (r2 == 0) goto L_0x035b
            androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk r2 = new androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk
            r2.<init>()
            r5.add(r2)
        L_0x035b:
            boolean r2 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.e()
            java.lang.String r8 = "vivo 1820"
            if (r2 != 0) goto L_0x0387
            boolean r2 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.f()
            if (r2 != 0) goto L_0x0387
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 == 0) goto L_0x0378
            java.lang.String r1 = android.os.Build.MODEL
            boolean r1 = r8.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0378
            goto L_0x0387
        L_0x0378:
            boolean r1 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.g()
            if (r1 != 0) goto L_0x0387
            boolean r1 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.h()
            if (r1 == 0) goto L_0x0385
            goto L_0x0387
        L_0x0385:
            r1 = 0
            goto L_0x0388
        L_0x0387:
            r1 = 1
        L_0x0388:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk> r2 = androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk.class
            boolean r1 = r3.a(r2, r1)
            if (r1 == 0) goto L_0x0398
            androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk r1 = new androidx.camera.video.internal.compat.quirk.ReportedVideoQualityNotSupportedQuirk
            r1.<init>()
            r5.add(r1)
        L_0x0398:
            java.util.List r1 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.a
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = r1.toUpperCase()
            java.util.List r10 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.a
            boolean r2 = r10.contains(r2)
            java.lang.Class<androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk> r10 = androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk.class
            boolean r2 = r3.a(r10, r2)
            if (r2 == 0) goto L_0x03b6
            androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk r2 = new androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk
            r2.<init>()
            r5.add(r2)
        L_0x03b6:
            boolean r2 = r11.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x03c4
            boolean r2 = r12.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x03c4
            r2 = 1
            goto L_0x03c5
        L_0x03c4:
            r2 = 0
        L_0x03c5:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk> r10 = androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk.class
            boolean r2 = r3.a(r10, r2)
            if (r2 == 0) goto L_0x03d5
            androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk r2 = new androidx.camera.video.internal.compat.quirk.VideoEncoderCrashQuirk
            r2.<init>()
            r5.add(r2)
        L_0x03d5:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x03e4
            java.lang.String r2 = "SM-J260F"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x03e4
            goto L_0x043d
        L_0x03e4:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x03f3
            java.lang.String r2 = "SM-J400G"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x03f3
            goto L_0x043d
        L_0x03f3:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0402
            java.lang.String r2 = "SM-J530F"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0402
            goto L_0x043d
        L_0x0402:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0411
            java.lang.String r2 = "sm-j600g"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0411
            goto L_0x043d
        L_0x0411:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0420
            java.lang.String r2 = "SM-J701F"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0420
            goto L_0x043d
        L_0x0420:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x042f
            java.lang.String r2 = "SM-G610M"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x042f
            goto L_0x043d
        L_0x042f:
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x043f
            java.lang.String r2 = "SM-J710MN"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x043f
        L_0x043d:
            r2 = 1
            goto L_0x0440
        L_0x043f:
            r2 = 0
        L_0x0440:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk> r10 = androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk.class
            boolean r2 = r3.a(r10, r2)
            if (r2 == 0) goto L_0x0450
            androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk r2 = new androidx.camera.video.internal.compat.quirk.ExcludeStretchedVideoQualityQuirk
            r2.<init>()
            r5.add(r2)
        L_0x0450:
            boolean r2 = r11.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x045d
            boolean r2 = r12.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x045d
            goto L_0x046d
        L_0x045d:
            java.lang.String r2 = "itel"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x046f
            java.lang.String r2 = "itel w6004"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x046f
        L_0x046d:
            r2 = 1
            goto L_0x0470
        L_0x046f:
            r2 = 0
        L_0x0470:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite> r10 = androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite.class
            boolean r2 = r3.a(r10, r2)
            if (r2 == 0) goto L_0x0480
            androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite r2 = new androidx.camera.video.internal.compat.quirk.MediaStoreVideoCannotWrite
            r2.<init>()
            r5.add(r2)
        L_0x0480:
            java.lang.String r2 = "Sony"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0492
            java.lang.String r2 = "G3125"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0492
            r2 = 1
            goto L_0x0493
        L_0x0492:
            r2 = 0
        L_0x0493:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk> r10 = androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk.class
            boolean r2 = r3.a(r10, r2)
            if (r2 == 0) goto L_0x04a3
            androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk r2 = new androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk
            r2.<init>()
            r5.add(r2)
        L_0x04a3:
            r0.equalsIgnoreCase(r6)
            java.lang.Class<androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk> r0 = androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class
            r2 = 0
            boolean r0 = r3.a(r0, r2)
            if (r0 == 0) goto L_0x04b7
            androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk r0 = new androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk
            r0.<init>()
            r5.add(r0)
        L_0x04b7:
            r0 = 34
            if (r9 >= r0) goto L_0x04bd
            r0 = 1
            goto L_0x04be
        L_0x04bd:
            r0 = 0
        L_0x04be:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk> r2 = androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x04ce
            androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk r0 = new androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk
            r0.<init>()
            r5.add(r0)
        L_0x04ce:
            java.util.List r0 = androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.a
            java.lang.String r0 = "oppo"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x04e7
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            java.util.List r2 = androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.a
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x04e7
            goto L_0x0544
        L_0x04e7:
            java.lang.String r0 = "lge"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x04f8
            java.lang.String r0 = "lg-m250"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x04f8
            goto L_0x0544
        L_0x04f8:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0505
            boolean r0 = r14.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0505
            goto L_0x0544
        L_0x0505:
            java.lang.String r0 = "realme"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0516
            java.lang.String r0 = "rmx1941"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0516
            goto L_0x0544
        L_0x0516:
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0527
            java.lang.String r0 = "Redmi 6A"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0527
            goto L_0x0544
        L_0x0527:
            java.lang.String r0 = "vivo"
            boolean r2 = r0.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0536
            boolean r2 = r8.equalsIgnoreCase(r1)
            if (r2 == 0) goto L_0x0536
            goto L_0x0544
        L_0x0536:
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0546
            java.lang.String r0 = "VIVO Y17"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0546
        L_0x0544:
            r0 = 1
            goto L_0x0547
        L_0x0546:
            r0 = 0
        L_0x0547:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk> r2 = androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x0557
            androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk r0 = new androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk
            r0.<init>()
            r5.add(r0)
        L_0x0557:
            boolean r0 = r13.equalsIgnoreCase(r6)
            java.lang.String r2 = "moto e5 play"
            if (r0 == 0) goto L_0x0567
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0567
            r0 = 1
            goto L_0x0568
        L_0x0567:
            r0 = 0
        L_0x0568:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk> r8 = androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk.class
            boolean r0 = r3.a(r8, r0)
            if (r0 == 0) goto L_0x0578
            androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk r0 = new androidx.camera.video.internal.compat.quirk.ExtraSupportedResolutionQuirk
            r0.<init>()
            r5.add(r0)
        L_0x0578:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0586
            boolean r0 = r2.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0586
            r0 = 1
            goto L_0x0587
        L_0x0586:
            r0 = 0
        L_0x0587:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r2 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x0597
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r0 = new androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk
            r0.<init>()
            r5.add(r0)
        L_0x0597:
            boolean r0 = r7.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x05a5
            boolean r0 = r15.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x05a5
            r0 = 1
            goto L_0x05a6
        L_0x05a5:
            r0 = 0
        L_0x05a6:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk> r2 = androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x05b6
            androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk r0 = new androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk
            r0.<init>()
            r5.add(r0)
        L_0x05b6:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x05c4
            boolean r0 = r14.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x05c4
            r0 = 1
            goto L_0x05c5
        L_0x05c4:
            r0 = 0
        L_0x05c5:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk> r2 = androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x05d5
            androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk r0 = new androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
            r0.<init>()
            r5.add(r0)
        L_0x05d5:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x05e3
            boolean r0 = r14.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x05e3
            r0 = 1
            goto L_0x05e4
        L_0x05e3:
            r0 = 0
        L_0x05e4:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk> r2 = androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x05f4
            androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk r0 = new androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk
            r0.<init>()
            r5.add(r0)
        L_0x05f4:
            boolean r0 = r7.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0602
            boolean r0 = r15.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0602
            r0 = 1
            goto L_0x0603
        L_0x0602:
            r0 = 0
        L_0x0603:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk> r2 = androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk.class
            boolean r0 = r3.a(r2, r0)
            if (r0 == 0) goto L_0x0613
            androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk r0 = new androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk
            r0.<init>()
            r5.add(r0)
        L_0x0613:
            boolean r0 = r13.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0621
            boolean r0 = r14.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0621
            r8 = 1
            goto L_0x0622
        L_0x0621:
            r8 = 0
        L_0x0622:
            java.lang.Class<androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk> r0 = androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk.class
            boolean r0 = r3.a(r0, r8)
            if (r0 == 0) goto L_0x0632
            androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk r0 = new androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk
            r0.<init>()
            r5.add(r0)
        L_0x0632:
            r4.<init>(r5)
            xf4.a = r4
            xe6 r0 = xf4.a
            xe6.o(r0)
            return
        L_0x063d:
            r2 = r21
            alb r2 = (alb) r2
            xe6 r3 = new xe6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = android.os.Build.BRAND
            java.lang.String r6 = "HUAWEI"
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 == 0) goto L_0x065d
            java.lang.String r6 = "SNE-LX1"
            java.lang.String r7 = android.os.Build.MODEL
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x065d
            goto L_0x066f
        L_0x065d:
            java.lang.String r6 = "HONOR"
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 == 0) goto L_0x0671
            java.lang.String r6 = "STK-LX1"
            java.lang.String r7 = android.os.Build.MODEL
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0671
        L_0x066f:
            r6 = 1
            goto L_0x06cd
        L_0x0671:
            java.lang.String r6 = android.os.Build.FINGERPRINT
            java.lang.String r7 = "generic"
            boolean r8 = r6.startsWith(r7)
            if (r8 != 0) goto L_0x06cc
            java.lang.String r8 = "unknown"
            boolean r6 = r6.startsWith(r8)
            if (r6 != 0) goto L_0x06cc
            java.lang.String r6 = android.os.Build.MODEL
            java.lang.String r8 = "google_sdk"
            boolean r9 = r6.contains(r8)
            if (r9 != 0) goto L_0x06cc
            java.lang.String r9 = "Emulator"
            boolean r9 = r6.contains(r9)
            if (r9 != 0) goto L_0x06cc
            java.lang.String r9 = "Cuttlefish"
            boolean r9 = r6.contains(r9)
            if (r9 != 0) goto L_0x06cc
            java.lang.String r9 = "Android SDK built for x86"
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x06cc
            java.lang.String r6 = android.os.Build.MANUFACTURER
            java.lang.String r9 = "Genymotion"
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x06cc
            boolean r6 = r5.startsWith(r7)
            if (r6 == 0) goto L_0x06bd
            java.lang.String r6 = android.os.Build.DEVICE
            boolean r6 = r6.startsWith(r7)
            if (r6 != 0) goto L_0x06cc
        L_0x06bd:
            java.lang.String r6 = android.os.Build.PRODUCT
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x06cc
            java.lang.String r6 = android.os.Build.HARDWARE
            java.lang.String r7 = "ranchu"
            r6.contains(r7)
        L_0x06cc:
            r6 = 0
        L_0x06cd:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk> r7 = androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class
            boolean r6 = r2.a(r7, r6)
            if (r6 == 0) goto L_0x06dd
            androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk r6 = new androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk
            r6.<init>()
            r4.add(r6)
        L_0x06dd:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk> r6 = androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk.class
            r7 = 1
            boolean r6 = r2.a(r6, r7)
            if (r6 == 0) goto L_0x06ee
            androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk r6 = new androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk
            r6.<init>()
            r4.add(r6)
        L_0x06ee:
            java.util.HashSet r6 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r7 = r5.toUpperCase(r6)
            java.lang.String r8 = android.os.Build.MODEL
            java.lang.String r9 = r8.toUpperCase(r6)
            java.util.HashSet r10 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.a
            android.util.Pair r7 = android.util.Pair.create(r7, r9)
            boolean r7 = r10.contains(r7)
            java.lang.Class<androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk> r9 = androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.class
            boolean r7 = r2.a(r9, r7)
            if (r7 == 0) goto L_0x0716
            androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk r7 = new androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk
            r7.<init>()
            r4.add(r7)
        L_0x0716:
            java.util.HashSet r7 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.a
            java.lang.String r8 = r8.toUpperCase(r6)
            boolean r7 = r7.contains(r8)
            java.lang.Class<androidx.camera.core.internal.compat.quirk.LowMemoryQuirk> r8 = androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class
            boolean r7 = r2.a(r8, r7)
            if (r7 == 0) goto L_0x0730
            androidx.camera.core.internal.compat.quirk.LowMemoryQuirk r7 = new androidx.camera.core.internal.compat.quirk.LowMemoryQuirk
            r7.<init>()
            r4.add(r7)
        L_0x0730:
            java.util.HashSet r7 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.a
            boolean r7 = r0.equalsIgnoreCase(r5)
            if (r7 != 0) goto L_0x0758
            java.lang.String r7 = android.os.Build.BRAND
            boolean r1 = r1.equalsIgnoreCase(r7)
            if (r1 == 0) goto L_0x0752
            java.util.HashSet r1 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.a
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toUpperCase(r8)
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto L_0x0752
            r1 = 1
            goto L_0x0753
        L_0x0752:
            r1 = 0
        L_0x0753:
            if (r1 == 0) goto L_0x0756
            goto L_0x0758
        L_0x0756:
            r1 = 0
            goto L_0x0759
        L_0x0758:
            r1 = 1
        L_0x0759:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk> r7 = androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk.class
            boolean r1 = r2.a(r7, r1)
            if (r1 == 0) goto L_0x0769
            androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk r1 = new androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk
            r1.<init>()
            r4.add(r1)
        L_0x0769:
            java.util.HashSet r1 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.a
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x0781
            java.util.HashSet r0 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.a
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r1 = r1.toUpperCase(r6)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0781
            r8 = 1
            goto L_0x0782
        L_0x0781:
            r8 = 0
        L_0x0782:
            java.lang.Class<androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk> r0 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class
            boolean r0 = r2.a(r0, r8)
            if (r0 == 0) goto L_0x0792
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = new androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk
            r0.<init>()
            r4.add(r0)
        L_0x0792:
            r3.<init>(r4)
            wf4.a = r3
            xe6 r0 = wf4.a
            xe6.o(r0)
            return
        L_0x079d:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            r1 = 1
            r0.a2(r1)
            return
        L_0x07a6:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            r0.a2(r7)
            return
        L_0x07ae:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            hm7 r1 = r0.G0
            int r1 = r1.d
            if (r1 == r7) goto L_0x07b9
            goto L_0x07cc
        L_0x07b9:
            av7 r1 = r0.I0
            zu7 r1 = r1.a()
            r2 = 1
            r1.i = r2
            av7 r2 = new av7
            r2.<init>(r1)
            r0.I0 = r2
            r0.f2()
        L_0x07cc:
            return
        L_0x07cd:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            hm7 r1 = r0.G0
            long r1 = r1.h
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x07da
            goto L_0x0800
        L_0x07da:
            java.util.concurrent.ConcurrentHashMap r3 = r0.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            av7 r1 = (defpackage.av7) r1
            if (r1 == 0) goto L_0x0800
            ru.ok.messages.location.FrgLocationMap r2 = r0.F0
            if (r2 == 0) goto L_0x0800
            java.lang.Object r2 = r0.b
            ge9 r2 = (defpackage.ge9) r2
            r3 = r2
            af9 r3 = (defpackage.af9) r3
            dm7 r1 = r1.a
            double r4 = r1.a
            double r6 = r1.b
            r8 = 0
            r3.B(r4, r6, r8)
            r1 = 1
            r0.J0 = r1
        L_0x0800:
            return
        L_0x0801:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            hm7 r1 = r0.G0
            long r1 = r1.h
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x085a
            ru.ok.messages.location.FrgLocationMap r3 = r0.F0
            if (r3 != 0) goto L_0x0812
            goto L_0x085a
        L_0x0812:
            java.util.concurrent.ConcurrentHashMap r4 = r0.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            av7 r1 = (defpackage.av7) r1
            if (r1 != 0) goto L_0x0821
            goto L_0x085a
        L_0x0821:
            hm7 r2 = r0.G0
            long r7 = r2.o
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0857
            java.util.concurrent.ConcurrentHashMap r2 = r0.o
            long r4 = r1.c
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r2 = r2.get(r4)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0857
            java.util.Iterator r2 = r2.iterator()
        L_0x083d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0857
            java.lang.Object r4 = r2.next()
            av7 r4 = (defpackage.av7) r4
            long r5 = r4.j
            hm7 r7 = r0.G0
            long r7 = r7.o
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x083d
            r3.s1(r4)
            goto L_0x085a
        L_0x0857:
            r3.s1(r1)
        L_0x085a:
            return
        L_0x085b:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            ru.ok.messages.location.FrgLocationMap r1 = r0.F0
            if (r1 != 0) goto L_0x0865
            goto L_0x09d3
        L_0x0865:
            hm7 r2 = r0.G0
            int r2 = r2.d
            r4 = 3
            r5 = -1
            java.lang.String r6 = "ru.ok.tamtam.extra.LOCATION"
            r7 = 0
            if (r2 != r4) goto L_0x0915
            dm7 r2 = r0.H0
            boolean r2 = r2.a()
            if (r2 != 0) goto L_0x0882
            java.lang.String r0 = "be9"
            java.lang.String r1 = "No last location marker. Ignore click"
            udd.q(r0, r1)
            goto L_0x09d3
        L_0x0882:
            java.util.concurrent.ConcurrentHashMap r2 = r0.c
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r2.remove(r4)
            dm7 r2 = r0.H0
            hm7 r4 = r0.G0
            gm7 r4 = r4.e
            hm7 r7 = r1.K1
            int r7 = r7.c
            java.lang.String r8 = "LIVE_LOCATION_SEND"
            r9 = 1
            if (r7 != r9) goto L_0x08df
            nqc r5 = r1.u1
            bd r5 = r5.b()
            java.lang.String r6 = "VIEWER"
            r5.g(r8, r6)
            long r5 = r1.L1
            x0d r7 = new x0d
            r7.<init>(r5)
            r5 = 0
            r7.l = r5
            r7.m = r2
            long r4 = r4.b
            r7.o = r4
            r2 = 1096810496(0x41600000, float:14.0)
            r7.n = r2
            y0d r2 = new y0d
            r2.<init>(r7)
            v2b r4 = r1.t1
            java.lang.Object r4 = r4.b
            k93 r4 = (defpackage.k93) r4
            o2a r4 = (o2a) r4
            w4 r4 = r4.getAccessor()
            java.lang.Class<luf> r5 = defpackage.luf.class
            java.lang.Object r4 = r4.c(r5)
            luf r4 = (defpackage.luf) r4
            r4.a(r2)
            android.content.Context r1 = r1.e0()
            int r2 = defpackage.cic.p0
            a06.E(r1, r2)
            goto L_0x0906
        L_0x08df:
            nqc r7 = r1.u1
            bd r7 = r7.b()
            java.lang.String r9 = "PICKER"
            r7.g(r8, r9)
            r5 r1 = r1.h1()
            if (r1 != 0) goto L_0x08f1
            goto L_0x0906
        L_0x08f1:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            r7.putExtra(r6, r2)
            java.lang.String r2 = "ru.ok.tamtam.extra.DURATION"
            long r8 = r4.b
            r7.putExtra(r2, r8)
            r1.setResult(r5, r7)
            r1.finish()
        L_0x0906:
            ai0 r1 = new ai0
            r2 = 15
            r1.<init>(r2)
            r0.b2(r1)
            r0.h2(r3)
            goto L_0x09d3
        L_0x0915:
            java.lang.Object r2 = r0.b
            ge9 r2 = (defpackage.ge9) r2
            af9 r2 = (defpackage.af9) r2
            kt7 r3 = r2.E()
            if (r3 != 0) goto L_0x0923
            goto L_0x09d3
        L_0x0923:
            av7 r4 = r0.I0
            dm7 r4 = r4.a
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x094b
            double[] r2 = r2.D()
            av7 r4 = r0.I0
            zu7 r4 = r4.a()
            dm7 r9 = new dm7
            r10 = 0
            r10 = r2[r10]
            r12 = 1
            r12 = r2[r12]
            r9.<init>(r10, r12)
            r4.a = r9
            av7 r2 = new av7
            r2.<init>(r4)
            r0.I0 = r2
        L_0x094b:
            av7 r0 = r0.I0
            dm7 r0 = r0.a
            r5 r2 = r1.h1()
            if (r2 != 0) goto L_0x0957
            goto L_0x09d3
        L_0x0957:
            gy5 r4 = r1.F1
            float r3 = r3.g
            if (r4 == 0) goto L_0x097b
            int r4 = r1.M1
            if (r4 == 0) goto L_0x097b
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r6 = "location_data"
            r4.putExtra(r6, r0)
            java.lang.String r0 = "zoom"
            r4.putExtra(r0, r3)
            gy5 r0 = r1.F1
            int r1 = r1.M1
            r0.Q(r1, r5, r4)
            r2.onBackPressed()
            goto L_0x09d3
        L_0x097b:
            be9 r4 = r1.G1
            hm7 r9 = r4.G0
            java.lang.Object r9 = r4.b
            ge9 r9 = (defpackage.ge9) r9
            af9 r9 = (defpackage.af9) r9
            r9.E()
            dm7 r4 = r4.H0
            wae r9 = r1.I1
            double r11 = r0.a
            double r13 = r4.a
            r10 = r9
            od r10 = (defpackage.od) r10
            double r7 = r0.b
            r19 = r6
            double r5 = r4.b
            r15 = r13
            r13 = r7
            r17 = r5
            boolean r4 = r10.f(r11, r13, r15, r17)
            if (r4 != 0) goto L_0x09ae
            nqc r4 = r1.u1
            bd r4 = r4.b()
            java.lang.String r5 = "LOCATION_SEND_DIFFERENT_LOCATION"
            r4.f(r5)
        L_0x09ae:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            r5 = r19
            r4.putExtra(r5, r0)
            java.lang.String r0 = "ru.ok.tamtam.extra.ZOOM"
            r4.putExtra(r0, r3)
            android.os.Bundle r0 = r1.Z
            if (r0 == 0) goto L_0x09cc
            java.lang.String r1 = "ru.ok.tamtam.extra.REQUEST_MESSAGE_ID"
            r5 = 0
            long r5 = r0.getLong(r1, r5)
            r4.putExtra(r1, r5)
        L_0x09cc:
            r0 = -1
            r2.setResult(r0, r4)
            r2.finish()
        L_0x09d3:
            return
        L_0x09d4:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            r0.Z1()
            return
        L_0x09dc:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            duf r1 = r0.C0
            r1.v()
            dm7 r1 = r0.H0
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x09ef
            goto L_0x0a6a
        L_0x09ef:
            hm7 r1 = r0.G0
            int r1 = r1.d
            r2 = 1
            if (r1 == r2) goto L_0x09f8
            r8 = 1
            goto L_0x09f9
        L_0x09f8:
            r8 = 0
        L_0x09f9:
            r0.J0 = r8
            av7 r1 = r0.I0
            dm7 r1 = r1.a
            double r9 = r1.a
            dm7 r2 = r0.H0
            double r13 = r2.a
            wae r3 = r0.Z
            r8 = r3
            od r8 = (defpackage.od) r8
            double r11 = r1.b
            double r1 = r2.b
            r15 = r1
            boolean r1 = r8.f(r9, r11, r13, r15)
            java.lang.Object r2 = r0.b
            ge9 r2 = (defpackage.ge9) r2
            if (r1 != 0) goto L_0x0a3d
            hm7 r1 = r0.G0
            int r1 = r1.d
            if (r1 != r7) goto L_0x0a3d
            av7 r1 = r0.I0
            zu7 r1 = r1.a()
            dm7 r3 = new dm7
            dm7 r4 = r0.H0
            double r5 = r4.a
            double r7 = r4.b
            r3.<init>(r5, r7)
            r1.a = r3
            av7 r3 = new av7
            r3.<init>(r1)
            r0.I0 = r3
            r0.d2()
            goto L_0x0a5d
        L_0x0a3d:
            av7 r1 = r0.I0
            zu7 r1 = r1.a()
            dm7 r3 = new dm7
            dm7 r4 = r0.H0
            double r5 = r4.a
            double r7 = r4.b
            r3.<init>(r5, r7)
            r1.a = r3
            av7 r3 = new av7
            r3.<init>(r1)
            r0.I0 = r3
            r1 = r2
            af9 r1 = (defpackage.af9) r1
            r1.F()
        L_0x0a5d:
            r3 = r2
            af9 r3 = (defpackage.af9) r3
            dm7 r0 = r0.H0
            double r4 = r0.a
            double r6 = r0.b
            r8 = 1
            r3.B(r4, r6, r8)
        L_0x0a6a:
            return
        L_0x0a6b:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            ru.ok.messages.location.FrgLocationMap r0 = r0.F0
            androidx.fragment.app.b r1 = r0.c0()
            boolean r2 = r1 instanceof ru.ok.messages.location.ActLocationMap
            if (r2 == 0) goto L_0x0a7d
            r0.f1()
            goto L_0x0a80
        L_0x0a7d:
            r1.onBackPressed()
        L_0x0a80:
            return
        L_0x0a81:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            r1 = 4
            r0.a2(r1)
            return
        L_0x0a8a:
            r0 = r21
            be9 r0 = (defpackage.be9) r0
            java.lang.Object r1 = r0.b
            ge9 r1 = (defpackage.ge9) r1
            af9 r1 = (defpackage.af9) r1
            double[] r1 = r1.D()
            av7 r2 = r0.I0
            zu7 r2 = r2.a()
            dm7 r3 = new dm7
            r4 = 0
            r4 = r1[r4]
            r6 = 1
            r8 = r1[r6]
            r3.<init>(r4, r8)
            r2.a = r3
            av7 r1 = new av7
            r1.<init>(r2)
            r0.I0 = r1
            hm7 r1 = r0.G0
            int r1 = r1.d
            if (r1 != r7) goto L_0x0abb
            r0.d2()
        L_0x0abb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai0.accept(java.lang.Object):void");
    }
}
