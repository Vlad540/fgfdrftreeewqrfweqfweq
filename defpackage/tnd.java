package defpackage;

import android.graphics.Color;

/* renamed from: tnd  reason: default package */
public final class tnd {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public tnd(String str, int i2, Integer num, Integer num2, float f2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        this.a = str;
        this.b = i2;
        this.c = num;
        this.d = num2;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i3;
    }

    public static int a(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        c3d.o("Ignoring unknown alignment: ", str);
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e2) {
            ez3.k0("Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            oyb.d(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(xie.l(((parseLong >> 24) & 255) ^ 255), xie.l(parseLong & 255), xie.l((parseLong >> 8) & 255), xie.l((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            ez3.k0("Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }
}
