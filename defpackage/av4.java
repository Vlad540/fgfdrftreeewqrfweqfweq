package defpackage;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;

/* renamed from: av4  reason: default package */
public final class av4 extends l5e implements i26 {
    public Bitmap X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int w0;
    public final /* synthetic */ bv4 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av4(int i, bv4 bv4, Continuation continuation) {
        super(2, continuation);
        this.w0 = i;
        this.x0 = bv4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        av4 av4 = new av4(this.w0, this.x0, continuation);
        av4.Z = obj;
        return av4;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        Bitmap bitmap;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        boolean z = true;
        if (i == 0) {
            wx3.H(obj);
            ou3 = (ou3) this.Z;
            String name = ou3.getClass().getName();
            int i2 = this.w0;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, name, wn6.h(i2, "start extracting sprite by index: "), (Throwable) null);
            }
            Bitmap A = xy6.A(this.x0.b, this.w0);
            bv4 bv4 = this.x0;
            int i3 = this.w0;
            ((Bitmap[]) bv4.a.a)[i3] = A;
            hcd hcd = bv4.d;
            Integer num = new Integer(i3);
            this.Z = ou3;
            this.X = A;
            this.Y = 1;
            if (hcd.a(num, this) == pu3) {
                return pu3;
            }
            bitmap = A;
        } else if (i == 1) {
            bitmap = this.X;
            ou3 = (ou3) this.Z;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String name2 = ou3.getClass().getName();
        int i4 = this.w0;
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            tn7 tn7 = tn7.X;
            if (bitmap == null) {
                z = false;
            }
            fn62.d(tn7, name2, "finish extracting sprite by index: " + i4 + " , sprite exist: " + z, (Throwable) null);
        }
        return jue.a;
    }
}
