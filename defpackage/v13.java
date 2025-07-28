package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: v13  reason: default package */
public final class v13 {
    public static final /* synthetic */ k77[] k;
    public final Context a;
    public final View b;
    public int c;
    public int d;
    public final xp0 e = new xp0();
    public final yj f = new yj(this);
    public u16 g = new t13(0);
    public float[] h = a06.c;
    public final int i = a24.X(((float) 1) * dh4.c().getDisplayMetrics().density);
    public final yr j;

    static {
        k77 hc9 = new hc9(v13.class, "imageAttaches", "getImageAttaches()Ljava/util/List;");
        m7c.a.getClass();
        k = new k77[]{hc9};
    }

    public v13(Context context, View view) {
        this.a = context;
        this.b = view;
        view.addOnAttachStateChangeListener(new ck(3, this));
        this.j = new kgd(0);
    }

    public static int d(int i2) {
        return (int) ((float) Math.rint((double) (((float) i2) * 0.4f)));
    }

    public final q13 a(int i2, int i3) {
        lfc e2;
        int length = this.h.length;
        int i4 = 0;
        while (i4 < length) {
            up6 c2 = this.e.c(i4);
            up6 up6 = c2 instanceof up6 ? c2 : null;
            if (up6 == null || (e2 = up6.e()) == null || !e2.getBounds().contains(i2, i3)) {
                i4++;
            } else {
                k77 k77 = k[0];
                q13 q13 = (q13) o23.Y(i4, (List) this.f.b);
                if (q13 == null) {
                    return null;
                }
                return q13;
            }
        }
        return null;
    }

    public final void b(int i2, int i3) {
        lfc e2;
        int length = this.h.length;
        int i4 = i2;
        for (int i5 = 0; i5 < length; i5++) {
            xp0 xp0 = this.e;
            up6 c2 = xp0.c(i5);
            up6 up6 = c2 instanceof up6 ? c2 : null;
            if (!(up6 == null || (e2 = up6.e()) == null)) {
                int i6 = up6.Z + i4;
                int i7 = this.c + i2;
                int i8 = this.i;
                if (i6 > i7) {
                    i3 += xp0.c(i5 - 1).w0 + i8;
                    i4 = i2;
                }
                e2.setBounds(i4, i3, up6.Z + i4, up6.w0 + i3);
                i4 += up6.Z + i8;
            }
        }
    }

    public final void c(int i2) {
        double d2;
        String str;
        int i3;
        xp0 xp0;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5 = i2;
        if (this.h.length != 0) {
            xp0 xp02 = this.e;
            if (((ArrayList) xp02.b).size() > 0) {
                this.d = 0;
                float[] fArr = this.h;
                String str2 = "Array is empty.";
                if (fArr.length != 0) {
                    float f2 = (float) i5;
                    double d3 = (double) (0.45f * f2);
                    double d4 = (double) (f2 * 0.6f);
                    int j2 = gwf.j((int) ((float) Math.rint((double) (((float) ((int) ((float) Math.rint(d3)))) / fArr[0]))), (int) ((float) Math.rint(d3)), (int) ((float) Math.rint(d4)));
                    int length = this.h.length;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        int i9 = this.i;
                        if (i6 < length) {
                            up6 c2 = xp02.c(i6);
                            up6 up6 = c2 instanceof up6 ? c2 : null;
                            if (up6 == null) {
                                xp0 = xp02;
                                i3 = length;
                                str = str2;
                                d2 = d3;
                            } else {
                                float f3 = (float) j2;
                                xp0 = xp02;
                                int i10 = j2;
                                i3 = length;
                                int rint = (int) ((float) Math.rint((double) (this.h[i6] * f3)));
                                float[] fArr2 = this.h;
                                if (fArr2.length != 0) {
                                    boolean z4 = true;
                                    if (fArr2[0] <= 1.0f || i6 != 0) {
                                        str = str2;
                                        z = false;
                                    } else {
                                        z = true;
                                        str = str2;
                                    }
                                    if (i6 == fArr2.length - 1) {
                                        z2 = true;
                                        d2 = d3;
                                    } else {
                                        d2 = d3;
                                        z2 = false;
                                    }
                                    boolean z5 = i6 < fArr2.length - 1 && Float.compare(fArr2[i6], fArr2[i6 + 1]) == 0;
                                    if (z || z2) {
                                        j2 = (!z || this.h.length <= 3) ? i10 : (int) ((float) Math.rint(d4));
                                        i4 = i5 - i7;
                                        z3 = true;
                                    } else {
                                        if (z5 && i8 == 0) {
                                            i4 = i5 / 2;
                                        } else if (i8 == 1) {
                                            i4 = i5 - i7;
                                        } else {
                                            int i11 = i5 - i7;
                                            i4 = i11 - rint < d(i2) ? i11 - d(i2) < d(i2) ? i11 : i11 - d(i2) : rint < d(i2) ? d(i2) : (int) ((float) Math.rint((double) (f3 * this.h[i6])));
                                        }
                                        j2 = i10;
                                        z3 = false;
                                    }
                                    if (i8 != 1 || z3) {
                                        z4 = z3;
                                    }
                                    up6.w0 = j2;
                                    up6.Z = i4;
                                    i8++;
                                    i7 += i4 + i9;
                                    if (z4) {
                                        this.d = j2 + i9 + this.d;
                                        j2 = gwf.j((int) ((float) Math.rint((double) (((float) ((int) ((float) Math.rint(d2)))) / this.h[i6]))), (int) ((float) Math.rint(d2)), (int) ((float) Math.rint(d4)));
                                        i7 = 0;
                                        i8 = 0;
                                    }
                                } else {
                                    throw new NoSuchElementException(str2);
                                }
                            }
                            i6++;
                            xp02 = xp0;
                            length = i3;
                            str2 = str;
                            d3 = d2;
                        } else {
                            this.d -= i9;
                            this.c = i5;
                            return;
                        }
                    }
                } else {
                    throw new NoSuchElementException(str2);
                }
            }
        }
    }

    public final void e(int i2, int i3, int[] iArr) {
        sxa sxa;
        lfc e2;
        int length = this.h.length;
        int i4 = 0;
        while (i4 < length) {
            up6 c2 = this.e.c(i4);
            up6 up6 = c2 instanceof up6 ? c2 : null;
            if (up6 == null || (sxa = (sxa) this.j.get(up6)) == null || (e2 = up6.e()) == null || !e2.getBounds().contains(i2, i3)) {
                i4++;
            } else {
                sxa.setHotspot((float) sxa.getBounds().centerX(), (float) sxa.getBounds().centerY());
                sxa.setState(iArr);
                return;
            }
        }
    }

    public final void f() {
        for (Map.Entry value : this.j.entrySet()) {
            ((sxa) value.getValue()).onThemeChanged(km4.y0.n(this.a).g());
        }
    }

    public final boolean g(Drawable drawable) {
        int i2 = 0;
        while (true) {
            xp0 xp0 = this.e;
            if (i2 >= ((ArrayList) xp0.b).size()) {
                return o23.R(this.j.values(), drawable);
            }
            if (drawable == xp0.c(i2).e()) {
                break;
            }
            i2++;
        }
    }
}
