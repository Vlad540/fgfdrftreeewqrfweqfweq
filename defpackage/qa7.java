package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import androidx.media3.common.PlaybackException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: qa7  reason: default package */
public abstract class qa7 {
    public static final gt6 a;

    static {
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_COMPILATION, MediaMetadataCompat.METADATA_KEY_DATE, MediaMetadataCompat.METADATA_KEY_YEAR, MediaMetadataCompat.METADATA_KEY_GENRE, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_ART, MediaMetadataCompat.METADATA_KEY_ART_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, MediaMetadataCompat.METADATA_KEY_USER_RATING, MediaMetadataCompat.METADATA_KEY_RATING, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"};
        int i = gt6.c;
        Object[] objArr = new Object[32];
        objArr[0] = MediaMetadataCompat.METADATA_KEY_TITLE;
        objArr[1] = MediaMetadataCompat.METADATA_KEY_ARTIST;
        objArr[2] = MediaMetadataCompat.METADATA_KEY_DURATION;
        objArr[3] = MediaMetadataCompat.METADATA_KEY_ALBUM;
        objArr[4] = MediaMetadataCompat.METADATA_KEY_AUTHOR;
        objArr[5] = MediaMetadataCompat.METADATA_KEY_WRITER;
        System.arraycopy(strArr, 0, objArr, 6, 26);
        a = gt6.i(32, objArr);
    }

    public static long a(cya cya, a88 a88, long j) {
        long j2 = cya == null ? 0 : cya.c;
        long c = c(cya, a88, j);
        long d = d(a88);
        return d == -9223372036854775807L ? Math.max(c, j2) : oze.k(j2, c, d);
    }

    public static byte[] b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static long c(cya cya, a88 a88, long j) {
        cya cya2 = cya;
        if (cya2 == null) {
            return 0;
        }
        long j2 = cya2.b;
        if (cya2.a == 3) {
            Long valueOf = j == -9223372036854775807L ? null : Long.valueOf(j);
            j2 = Math.max(0, j2 + ((long) (cya2.o * ((float) (valueOf != null ? valueOf.longValue() : SystemClock.elapsedRealtime() - cya2.w0)))));
        }
        long j3 = j2;
        long d = d(a88);
        return d == -9223372036854775807L ? Math.max(0, j3) : oze.k(j3, 0, d);
    }

    public static long d(a88 a88) {
        if (a88 == null || !a88.a.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            return -9223372036854775807L;
        }
        long a2 = a88.a(MediaMetadataCompat.METADATA_KEY_DURATION);
        if (a2 <= 0) {
            return -9223372036854775807L;
        }
        return a2;
    }

    public static long e(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                throw new IllegalArgumentException(wn6.h(i, "Unrecognized FolderType: "));
        }
    }

    public static int f(long j) {
        if (j == 0) {
            return 0;
        }
        if (j == 1) {
            return 1;
        }
        if (j == 2) {
            return 2;
        }
        if (j == 3) {
            return 3;
        }
        if (j == 4) {
            return 4;
        }
        if (j == 5) {
            return 5;
        }
        return j == 6 ? 6 : 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.c58 g(defpackage.l68 r17, android.graphics.Bitmap r18) {
        /*
            r0 = r17
            r1 = 2
            r2 = 3
            r3 = -1
            r4 = 0
            r5 = 1
            java.lang.String r6 = r0.a
            java.lang.String r7 = ""
            boolean r6 = r6.equals(r7)
            r7 = 0
            if (r6 == 0) goto L_0x0014
            r9 = r7
            goto L_0x0017
        L_0x0014:
            java.lang.String r6 = r0.a
            r9 = r6
        L_0x0017:
            if (r18 == 0) goto L_0x001c
            r13 = r18
            goto L_0x001d
        L_0x001c:
            r13 = r7
        L_0x001d:
            z78 r6 = r0.d
            android.os.Bundle r8 = r6.I
            if (r8 == 0) goto L_0x0029
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r8)
            r8 = r10
        L_0x0029:
            java.lang.Integer r10 = r6.p
            if (r10 == 0) goto L_0x0035
            int r11 = r10.intValue()
            if (r11 == r3) goto L_0x0035
            r11 = r5
            goto L_0x0036
        L_0x0035:
            r11 = r4
        L_0x0036:
            java.lang.Integer r12 = r6.H
            if (r12 == 0) goto L_0x003c
            r14 = r5
            goto L_0x003d
        L_0x003c:
            r14 = r4
        L_0x003d:
            if (r11 != 0) goto L_0x0041
            if (r14 == 0) goto L_0x0069
        L_0x0041:
            if (r8 != 0) goto L_0x0048
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L_0x0048:
            if (r11 == 0) goto L_0x005a
            r10.getClass()
            int r10 = r10.intValue()
            long r10 = e(r10)
            java.lang.String r15 = "android.media.extra.BT_FOLDER_TYPE"
            r8.putLong(r15, r10)
        L_0x005a:
            if (r14 == 0) goto L_0x0069
            r12.getClass()
            int r10 = r12.intValue()
            long r10 = (long) r10
            java.lang.String r12 = "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"
            r8.putLong(r12, r10)
        L_0x0069:
            java.lang.CharSequence r10 = r6.a
            java.lang.CharSequence r11 = r6.e
            if (r11 == 0) goto L_0x0085
            if (r8 != 0) goto L_0x0076
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
        L_0x0076:
            java.lang.String r1 = "androidx.media3.mediadescriptioncompat.title"
            r8.putCharSequence(r1, r10)
            java.lang.CharSequence r1 = r6.f
            java.lang.CharSequence r2 = r6.g
            r12 = r2
            r15 = r8
            r10 = r11
            r11 = r1
            goto L_0x010e
        L_0x0085:
            java.lang.CharSequence[] r11 = new java.lang.CharSequence[r2]
            r12 = r4
            r14 = r12
        L_0x0089:
            if (r12 >= r2) goto L_0x0104
            java.lang.String[] r15 = defpackage.a88.o
            int r2 = r15.length
            if (r14 >= r2) goto L_0x0104
            int r2 = r14 + 1
            r14 = r15[r14]
            r14.getClass()
            int r15 = r14.hashCode()
            switch(r15) {
                case -1853648227: goto L_0x00d7;
                case -1224124471: goto L_0x00cc;
                case 1684534006: goto L_0x00c1;
                case 1879671865: goto L_0x00b6;
                case 1897146402: goto L_0x00ab;
                case 1965214221: goto L_0x00a0;
                default: goto L_0x009e;
            }
        L_0x009e:
            r14 = r3
            goto L_0x00e1
        L_0x00a0:
            java.lang.String r15 = "android.media.metadata.ALBUM_ARTIST"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00a9
            goto L_0x009e
        L_0x00a9:
            r14 = 5
            goto L_0x00e1
        L_0x00ab:
            java.lang.String r15 = "android.media.metadata.TITLE"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00b4
            goto L_0x009e
        L_0x00b4:
            r14 = 4
            goto L_0x00e1
        L_0x00b6:
            java.lang.String r15 = "android.media.metadata.ALBUM"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00bf
            goto L_0x009e
        L_0x00bf:
            r14 = 3
            goto L_0x00e1
        L_0x00c1:
            java.lang.String r15 = "android.media.metadata.COMPOSER"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00ca
            goto L_0x009e
        L_0x00ca:
            r14 = r1
            goto L_0x00e1
        L_0x00cc:
            java.lang.String r15 = "android.media.metadata.WRITER"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00d5
            goto L_0x009e
        L_0x00d5:
            r14 = r5
            goto L_0x00e1
        L_0x00d7:
            java.lang.String r15 = "android.media.metadata.ARTIST"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x00e0
            goto L_0x009e
        L_0x00e0:
            r14 = r4
        L_0x00e1:
            switch(r14) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00ee;
                case 3: goto L_0x00eb;
                case 4: goto L_0x00e9;
                case 5: goto L_0x00e6;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            r14 = r7
            goto L_0x00f6
        L_0x00e6:
            java.lang.CharSequence r14 = r6.d
            goto L_0x00f6
        L_0x00e9:
            r14 = r10
            goto L_0x00f6
        L_0x00eb:
            java.lang.CharSequence r14 = r6.c
            goto L_0x00f6
        L_0x00ee:
            java.lang.CharSequence r14 = r6.A
            goto L_0x00f6
        L_0x00f1:
            java.lang.CharSequence r14 = r6.z
            goto L_0x00f6
        L_0x00f4:
            java.lang.CharSequence r14 = r6.b
        L_0x00f6:
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 != 0) goto L_0x0101
            int r15 = r12 + 1
            r11[r12] = r14
            r12 = r15
        L_0x0101:
            r14 = r2
            r2 = 3
            goto L_0x0089
        L_0x0104:
            r2 = r11[r4]
            r3 = r11[r5]
            r1 = r11[r1]
            r12 = r1
            r10 = r2
            r11 = r3
            r15 = r8
        L_0x010e:
            d68 r0 = r0.f
            android.net.Uri r0 = r0.a
            c58 r1 = new c58
            android.net.Uri r14 = r6.m
            r8 = r1
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa7.g(l68, android.graphics.Bitmap):c58");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [it4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [t58, v58] */
    public static l68 h(c58 c58) {
        c58.getClass();
        r58 r58 = new r58();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        Collections.emptyList();
        x58 x58 = new x58();
        d68 d68 = d68.d;
        String str = c58.a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String str2 = str;
        ? obj = new Object();
        obj.a = c58.w0;
        d68 d682 = new d68(obj);
        z78 j = j(c58, 0);
        ? t58 = new t58(r58);
        z58 z58 = new z58(x58);
        if (j == null) {
            j = z78.J;
        }
        return new l68(str2, t58, (a68) null, z58, j, d682);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [t58, v58] */
    /* JADX WARNING: type inference failed for: r2v1, types: [it4, java.lang.Object] */
    public static l68 i(String str, a88 a88, int i) {
        d68 d68;
        r58 r58 = new r58();
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        Collections.emptyList();
        e8c e8c2 = e8c.X;
        x58 x58 = new x58();
        d68 d682 = d68.d;
        String str2 = null;
        if (str == null) {
            str = null;
        }
        CharSequence charSequence = a88.a.getCharSequence(MediaMetadataCompat.METADATA_KEY_MEDIA_URI);
        if (charSequence != null) {
            str2 = charSequence.toString();
        }
        if (str2 != null) {
            ? obj = new Object();
            obj.a = Uri.parse(str2);
            d68 = new d68(obj);
        } else {
            d68 = d682;
        }
        z78 k = k(a88, i);
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return new l68(str, new t58(r58), (a68) null, new z58(x58), k != null ? k : z78.J, d68);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [x78, java.lang.Object] */
    public static z78 j(c58 c58, int i) {
        dyb dyb;
        byte[] bArr;
        if (c58 == null) {
            return z78.J;
        }
        ? obj = new Object();
        obj.f = c58.c;
        obj.g = c58.o;
        obj.m = c58.Y;
        Bundle bundle = null;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dyb = new dyb(i, -1.0f);
                break;
            default:
                dyb = null;
                break;
        }
        obj.i = q(dyb);
        Bitmap bitmap = c58.X;
        if (bitmap != null) {
            try {
                bArr = b(bitmap);
            } catch (IOException e) {
                ez3.k0("Failed to convert iconBitmap to artworkData", e);
                bArr = null;
            }
            obj.f(bArr, 3);
        }
        Bundle bundle2 = c58.Z;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        }
        if (bundle != null && bundle.containsKey(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)) {
            obj.p = Integer.valueOf(f(bundle.getLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)));
            bundle.remove(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE);
        }
        obj.q = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            obj.G = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        CharSequence charSequence = c58.b;
        if (bundle == null || !bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            obj.a = charSequence;
        } else {
            obj.a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            obj.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        }
        if (bundle != null && !bundle.isEmpty()) {
            obj.H = bundle;
        }
        obj.r = Boolean.TRUE;
        return new z78(obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [x78, java.lang.Object] */
    public static z78 k(a88 a88, int i) {
        dyb dyb;
        dyb dyb2;
        String str;
        dyb dyb3;
        if (a88 == null) {
            return z78.J;
        }
        ? obj = new Object();
        Bundle bundle = a88.a;
        CharSequence charSequence = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_TITLE);
        CharSequence charSequence2 = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        obj.a = charSequence != null ? charSequence : charSequence2;
        Bitmap bitmap = null;
        if (charSequence == null) {
            charSequence2 = null;
        }
        obj.e = charSequence2;
        obj.f = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
        obj.g = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        obj.b = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ARTIST);
        obj.c = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ALBUM);
        obj.d = bundle.getCharSequence(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST);
        try {
            dyb = dyb.a(bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_RATING));
        } catch (Exception unused) {
            dyb = null;
        }
        obj.j = q(dyb);
        if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            long a2 = a88.a(MediaMetadataCompat.METADATA_KEY_DURATION);
            if (a2 >= 0) {
                obj.i(Long.valueOf(a2));
            }
        }
        try {
            dyb2 = dyb.a(bundle.getParcelable(MediaMetadataCompat.METADATA_KEY_USER_RATING));
        } catch (Exception unused2) {
            dyb2 = null;
        }
        ayb q = q(dyb2);
        if (q != null) {
            obj.i = q;
        } else {
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    dyb3 = new dyb(i, -1.0f);
                    break;
                default:
                    dyb3 = null;
                    break;
            }
            obj.i = q(dyb3);
        }
        if (bundle.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
            obj.s = Integer.valueOf((int) a88.a(MediaMetadataCompat.METADATA_KEY_YEAR));
        }
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI};
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < 2) {
                String str2 = strArr[i3];
                if (bundle.containsKey(str2)) {
                    CharSequence charSequence3 = bundle.getCharSequence(str2);
                    if (charSequence3 != null) {
                        str = charSequence3.toString();
                    }
                } else {
                    i3++;
                }
            }
        }
        str = null;
        if (str != null) {
            obj.m = Uri.parse(str);
        }
        String[] strArr2 = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_ALBUM_ART};
        while (true) {
            if (i2 < 2) {
                String str3 = strArr2[i2];
                if (bundle.containsKey(str3)) {
                    try {
                        bitmap = (Bitmap) bundle.getParcelable(str3);
                    } catch (Exception unused3) {
                    }
                } else {
                    i2++;
                }
            }
        }
        if (bitmap != null) {
            try {
                obj.f(b(bitmap), 3);
            } catch (IOException e) {
                ez3.k0("Failed to convert artworkBitmap to artworkData", e);
            }
        }
        boolean containsKey = bundle.containsKey(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        obj.q = Boolean.valueOf(containsKey);
        if (containsKey) {
            obj.p = Integer.valueOf(f(a88.a(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE)));
        }
        if (bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            obj.G = Integer.valueOf((int) a88.a("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        obj.r = Boolean.TRUE;
        Bundle bundle2 = new Bundle(bundle);
        rue g = a.iterator();
        while (g.hasNext()) {
            bundle2.remove((String) g.next());
        }
        if (!bundle2.isEmpty()) {
            obj.H = bundle2;
        }
        return new z78(obj);
    }

    public static a88 l(z78 z78, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        c9 c9Var = new c9(15);
        c9Var.o(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, str);
        CharSequence charSequence = z78.a;
        if (charSequence != null) {
            c9Var.p(MediaMetadataCompat.METADATA_KEY_TITLE, charSequence);
        }
        CharSequence charSequence2 = z78.e;
        if (charSequence2 != null) {
            c9Var.p(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, charSequence2);
        }
        CharSequence charSequence3 = z78.f;
        if (charSequence3 != null) {
            c9Var.p(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, charSequence3);
        }
        CharSequence charSequence4 = z78.g;
        if (charSequence4 != null) {
            c9Var.p(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, charSequence4);
        }
        CharSequence charSequence5 = z78.b;
        if (charSequence5 != null) {
            c9Var.p(MediaMetadataCompat.METADATA_KEY_ARTIST, charSequence5);
        }
        CharSequence charSequence6 = z78.c;
        if (charSequence6 != null) {
            c9Var.p(MediaMetadataCompat.METADATA_KEY_ALBUM, charSequence6);
        }
        CharSequence charSequence7 = z78.d;
        if (charSequence7 != null) {
            c9Var.p(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, charSequence7);
        }
        Integer num = z78.t;
        if (num != null) {
            c9Var.k((long) num.intValue(), MediaMetadataCompat.METADATA_KEY_YEAR);
        }
        if (uri != null) {
            c9Var.o(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, uri.toString());
        }
        Uri uri2 = z78.m;
        if (uri2 != null) {
            c9Var.o(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, uri2.toString());
            c9Var.o(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, uri2.toString());
        }
        if (bitmap != null) {
            c9Var.j(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
            c9Var.j(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        Integer num2 = z78.p;
        if (!(num2 == null || num2.intValue() == -1)) {
            c9Var.k(e(num2.intValue()), MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        }
        if (j == -9223372036854775807L && (l = z78.h) != null) {
            j = l.longValue();
        }
        if (j != -9223372036854775807L) {
            c9Var.k(j, MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        dyb r = r(z78.i);
        if (r != null) {
            c9Var.l(MediaMetadataCompat.METADATA_KEY_USER_RATING, r);
        }
        dyb r2 = r(z78.j);
        if (r2 != null) {
            c9Var.l(MediaMetadataCompat.METADATA_KEY_RATING, r2);
        }
        Integer num3 = z78.H;
        if (num3 != null) {
            c9Var.k((long) num3.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        Bundle bundle = z78.I;
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj == null || (obj instanceof CharSequence)) {
                    c9Var.p(next, (CharSequence) obj);
                } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    c9Var.k(((Number) obj).longValue(), next);
                }
            }
        }
        return new a88((Bundle) c9Var.b);
    }

    public static PlaybackException m(cya cya) {
        String str = null;
        if (cya == null || cya.a != 7) {
            return null;
        }
        CharSequence charSequence = cya.Z;
        if (charSequence != null) {
            str = charSequence.toString();
        }
        String str2 = str;
        int t = t(cya.Y);
        if (t == -5) {
            t = 2000;
        } else if (t == -1) {
            t = 1000;
        }
        int i = t;
        Bundle bundle = cya.z0;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new PlaybackException(str2, (Throwable) null, i, bundle, SystemClock.elapsedRealtime());
    }

    public static int n(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                ez3.j0("Unrecognized RepeatMode: " + i + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                return 0;
            }
        }
        return i2;
    }

    public static int o(qza qza) {
        if (qza.X() != null) {
            return 7;
        }
        int playbackState = qza.getPlaybackState();
        boolean c0 = oze.c0(qza, true);
        if (playbackState == 1) {
            return 0;
        }
        if (playbackState == 2) {
            return c0 ? 2 : 6;
        }
        if (playbackState == 3) {
            return c0 ? 2 : 3;
        }
        if (playbackState == 4) {
            return 1;
        }
        throw new IllegalArgumentException(wn6.h(playbackState, "Unrecognized State: "));
    }

    public static long p(int i) {
        if (i == -1) {
            return -1;
        }
        return (long) i;
    }

    public static ayb q(dyb dyb) {
        if (dyb == null) {
            return null;
        }
        boolean z = true;
        boolean z2 = false;
        float f = dyb.b;
        int i = dyb.a;
        switch (i) {
            case 1:
                if (!dyb.c()) {
                    return new lf6();
                }
                if (i == 1) {
                    if (f != 1.0f) {
                        z = false;
                    }
                    z2 = z;
                }
                return new lf6(z2);
            case 2:
                if (!dyb.c()) {
                    return new uie();
                }
                if (i == 2) {
                    if (f != 1.0f) {
                        z = false;
                    }
                    z2 = z;
                }
                return new uie(z2);
            case 3:
                return dyb.c() ? new vod(3, dyb.b()) : new vod(3);
            case 4:
                return dyb.c() ? new vod(4, dyb.b()) : new vod(4);
            case 5:
                return dyb.c() ? new vod(5, dyb.b()) : new vod(5);
            case 6:
                if (!dyb.c()) {
                    return new kma();
                }
                if (i != 6 || !dyb.c()) {
                    f = -1.0f;
                }
                return new kma(f);
            default:
                return null;
        }
    }

    public static dyb r(ayb ayb) {
        if (ayb == null) {
            return null;
        }
        int x = x(ayb);
        if (!ayb.b()) {
            switch (x) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return new dyb(x, -1.0f);
                default:
                    return null;
            }
        } else {
            float f = 1.0f;
            switch (x) {
                case 1:
                    if (!((lf6) ayb).c) {
                        f = 0.0f;
                    }
                    return new dyb(1, f);
                case 2:
                    if (!((uie) ayb).c) {
                        f = 0.0f;
                    }
                    return new dyb(2, f);
                case 3:
                case 4:
                case 5:
                    return dyb.d(x, ((vod) ayb).c);
                case 6:
                    float f2 = ((kma) ayb).b;
                    if (f2 < 0.0f || f2 > 100.0f) {
                        return null;
                    }
                    return new dyb(6, f2);
                default:
                    return null;
            }
        }
    }

    public static int s(int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 3)) {
                ez3.j0("Unrecognized PlaybackStateCompat.RepeatMode: " + i + " was converted to `Player.REPEAT_MODE_OFF`");
                return 0;
            }
        }
        return i2;
    }

    public static int t(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -6;
            case 3:
                return -102;
            case 4:
                return -103;
            case 5:
                return -104;
            case 6:
                return -105;
            case 7:
                return -106;
            case 8:
                return -110;
            case 9:
                return -107;
            case 10:
                return 1;
            case 11:
                return -109;
            default:
                return -1;
        }
    }

    public static boolean u(int i) {
        if (i == -1 || i == 0) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        throw new IllegalArgumentException(wn6.h(i, "Unrecognized ShuffleMode: "));
    }

    public static void v(ch7 ch7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long j = 3000;
        while (true) {
            try {
                ch7.get(j, TimeUnit.MILLISECONDS);
                if (z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            } catch (InterruptedException unused) {
                z = true;
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 < 3000) {
                    j = 3000 - elapsedRealtime2;
                } else {
                    throw new TimeoutException();
                }
            } catch (Throwable th) {
                if (1 != 0) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    public static int w(k20 k20) {
        int i = 1;
        int i2 = m20.b;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(k20.a);
        builder.setFlags(k20.b);
        builder.setUsage(k20.c);
        AudioAttributes build = builder.build();
        build.getClass();
        int flags = build.getFlags();
        int usage = build.getUsage();
        if ((flags & 1) != 1) {
            if ((flags & 4) != 4) {
                switch (usage) {
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i = 5;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 11:
                        i = 10;
                        break;
                    case 13:
                        break;
                    default:
                        i = 3;
                        break;
                }
            } else {
                i = 6;
            }
        } else {
            i = 7;
        }
        if (i == Integer.MIN_VALUE) {
            return 3;
        }
        return i;
    }

    public static int x(ayb ayb) {
        if (ayb instanceof lf6) {
            return 1;
        }
        if (ayb instanceof uie) {
            return 2;
        }
        if (!(ayb instanceof vod)) {
            return ayb instanceof kma ? 6 : 0;
        }
        int i = ((vod) ayb).b;
        int i2 = 3;
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                i2 = 5;
                if (i != 5) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static boolean y(long j, long j2) {
        return (j & j2) != 0;
    }
}
