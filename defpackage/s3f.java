package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* renamed from: s3f  reason: default package */
public final class s3f implements q3f {
    public final q3f a;
    public final Range b;
    public final Range c;
    public final HashSet o;

    public s3f(q3f q3f) {
        HashSet hashSet = new HashSet();
        this.o = hashSet;
        this.a = q3f;
        int a1 = q3f.a1();
        this.b = Range.create(Integer.valueOf(a1), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) a1))) * a1));
        int w1 = q3f.w1();
        this.c = Range.create(Integer.valueOf(w1), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) w1))) * w1));
        List list = MediaCodecInfoReportIncorrectInfoQuirk.a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.emptySet());
    }

    public static q3f a(q3f q3f, Size size) {
        if (!(q3f instanceof s3f)) {
            if (xf4.a.j(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !q3f.Q0(size.getWidth(), size.getHeight())) {
                    Range x1 = q3f.x1();
                    Range E1 = q3f.E1();
                    size.toString();
                    Objects.toString(x1);
                    Objects.toString(E1);
                }
            }
            q3f = new s3f(q3f);
        }
        if (size != null && (q3f instanceof s3f)) {
            ((s3f) q3f).o.add(size);
        }
        return q3f;
    }

    public final boolean A1(int i, int i2) {
        q3f q3f = this.a;
        if (q3f.A1(i, i2)) {
            return true;
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        if (this.b.contains(Integer.valueOf(i))) {
            return this.c.contains(Integer.valueOf(i2)) && i % q3f.a1() == 0 && i2 % q3f.w1() == 0;
        }
    }

    public final Range E1() {
        return this.c;
    }

    public final int a1() {
        return this.a.a1();
    }

    public final Range b1() {
        return this.a.b1();
    }

    public final boolean h1() {
        return this.a.h1();
    }

    public final Range r1(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean contains = range.contains(valueOf);
        q3f q3f = this.a;
        boolean z = contains && i % q3f.w1() == 0;
        e07.j("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + q3f.w1(), z);
        return this.b;
    }

    public final Range v1(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean contains = range.contains(valueOf);
        q3f q3f = this.a;
        boolean z = contains && i % q3f.a1() == 0;
        e07.j("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + q3f.a1(), z);
        return this.c;
    }

    public final int w1() {
        return this.a.w1();
    }

    public final Range x1() {
        return this.b;
    }
}
