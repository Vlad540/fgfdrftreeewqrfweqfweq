package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ov4  reason: default package */
public final class ov4 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ uv4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ov4(uv4 uv4, Continuation continuation) {
        super(2, continuation);
        this.Z = uv4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ov4) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ov4 ov4 = new ov4(this.Z, continuation);
        ov4.Y = obj;
        return ov4;
    }

    public final Object o(Object obj) {
        Object obj2;
        rj5 rj5;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        ku4 ku4;
        pu3 pu3 = pu3.a;
        int i4 = this.X;
        int i5 = 1;
        if (i4 == 0) {
            wx3.H(obj);
            rj5 = (rj5) this.Y;
            c9 c9Var = this.Z.c;
            this.Y = rj5;
            this.X = 1;
            wv4 wv4 = (wv4) c9Var.b;
            wv4.getClass();
            lg7 c = hwf.c();
            int i6 = 0;
            while (i6 < 9) {
                Object[] objArr2 = fja.a[i6];
                int length = objArr2.length;
                int i7 = 0;
                while (i7 < length) {
                    Object obj3 = objArr2[i7];
                    if (obj3 instanceof String) {
                        ku4 ku42 = r8;
                        i = i7;
                        i2 = length;
                        i3 = i6;
                        objArr = objArr2;
                        ku4 ku43 = new ku4(i6, i5, (CharSequence) obj3, (List) null, wv4.c((String) obj3), 0, 40);
                        c.add(ku42);
                    } else {
                        i = i7;
                        i2 = length;
                        i3 = i6;
                        objArr = objArr2;
                        if (obj3 instanceof Object[]) {
                            Object[] objArr3 = (Object[]) obj3;
                            if (objArr3[0] instanceof Object[]) {
                                String str = ((String[][]) objArr3)[0][0];
                                Object[][] objArr4 = (Object[][]) objArr3;
                                int i8 = 0;
                                for (Object[] length2 : objArr4) {
                                    i8 += length2.length;
                                }
                                ArrayList arrayList = new ArrayList(i8);
                                for (Object[] M : objArr4) {
                                    u23.M(arrayList, M);
                                }
                                ku4 = new ku4(i3, i5, str, arrayList, wv4.c(str), 0, 32);
                            } else {
                                String str2 = ((String[]) objArr3)[0];
                                ku4 = new ku4(i3, i5, str2, cs.g0(objArr3), wv4.c(str2), 0, 32);
                            }
                            c.add(ku4);
                        }
                    }
                    i5++;
                    i7 = i + 1;
                    i6 = i3;
                    length = i2;
                    objArr2 = objArr;
                }
                i6++;
            }
            obj2 = hwf.a(c);
            if (obj2 == pu3) {
                return pu3;
            }
        } else if (i4 == 1) {
            rj5 = (rj5) this.Y;
            wx3.H(obj);
            obj2 = obj;
        } else if (i4 == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y = null;
        this.X = 2;
        if (rj5.a(obj2, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
