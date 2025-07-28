package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: jf4  reason: default package */
public final class jf4 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ rj5 Z;
    public /* synthetic */ Object[] w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rj5 rj5 = (rj5) obj;
        Object[] objArr = (Object[]) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                jf4 jf4 = new jf4(3, continuation, 0);
                jf4.Z = rj5;
                jf4.w0 = objArr;
                return jf4.o(jue.a);
            case 1:
                jf4 jf42 = new jf4(3, continuation, 1);
                jf42.Z = rj5;
                jf42.w0 = objArr;
                return jf42.o(jue.a);
            case 2:
                jf4 jf43 = new jf4(3, continuation, 2);
                jf43.Z = rj5;
                jf43.w0 = objArr;
                return jf43.o(jue.a);
            case 3:
                jf4 jf44 = new jf4(3, continuation, 3);
                jf44.Z = rj5;
                jf44.w0 = objArr;
                return jf44.o(jue.a);
            default:
                jf4 jf45 = new jf4(3, continuation, 4);
                jf45.Z = rj5;
                jf45.w0 = objArr;
                return jf45.o(jue.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                pu3 pu3 = pu3.a;
                int i = this.Y;
                if (i == 0) {
                    wx3.H(obj);
                    rj5 rj5 = this.Z;
                    List[] listArr = (List[]) this.w0;
                    ArrayList arrayList = new ArrayList();
                    for (List K : listArr) {
                        u23.K(K, arrayList);
                    }
                    this.Y = 1;
                    if (rj5.a(arrayList, this) == pu3) {
                        return pu3;
                    }
                } else if (i == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return jue.a;
            case 1:
                pu3 pu32 = pu3.a;
                int i2 = this.Y;
                jue jue = jue.a;
                if (i2 == 0) {
                    wx3.H(obj);
                    rj5 rj52 = this.Z;
                    this.Y = 1;
                    if (rj52.a(jue, this) == pu32) {
                        return pu32;
                    }
                } else if (i2 == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return jue;
            case 2:
                pu3 pu33 = pu3.a;
                int i3 = this.Y;
                if (i3 == 0) {
                    wx3.H(obj);
                    rj5 rj53 = this.Z;
                    z4a[] z4aArr = (z4a[]) this.w0;
                    int S = ju7.S(z4aArr.length);
                    if (S < 16) {
                        S = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(S);
                    for (z4a z4a : z4aArr) {
                        linkedHashMap.put(z4a.a, z4a);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(ju7.S(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), ((z4a) entry.getValue()).b);
                    }
                    bs5 bs5 = new bs5(linkedHashMap2);
                    this.Y = 1;
                    if (rj53.a(bs5, this) == pu33) {
                        return pu33;
                    }
                } else if (i3 == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return jue.a;
            case 3:
                pu3 pu34 = pu3.a;
                int i4 = this.Y;
                if (i4 == 0) {
                    wx3.H(obj);
                    rj5 rj54 = this.Z;
                    ArrayList X2 = cs.X((i22[]) this.w0);
                    int S2 = ju7.S(q23.H(X2, 10));
                    if (S2 < 16) {
                        S2 = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(S2);
                    Iterator it = X2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        linkedHashMap3.put(new Long(((i22) next).a), next);
                    }
                    this.Y = 1;
                    if (rj54.a(linkedHashMap3, this) == pu34) {
                        return pu34;
                    }
                } else if (i4 == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return jue.a;
            default:
                pu3 pu35 = pu3.a;
                int i5 = this.Y;
                if (i5 == 0) {
                    wx3.H(obj);
                    rj5 rj55 = this.Z;
                    kta[] ktaArr = (kta[]) this.w0;
                    int S3 = ju7.S(ktaArr.length);
                    if (S3 < 16) {
                        S3 = 16;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(S3);
                    for (kta kta : ktaArr) {
                        linkedHashMap4.put(new Long(kta.a), kta);
                    }
                    this.Y = 1;
                    if (rj55.a(linkedHashMap4, this) == pu35) {
                        return pu35;
                    }
                } else if (i5 == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return jue.a;
        }
    }
}
