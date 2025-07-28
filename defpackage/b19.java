package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: b19  reason: default package */
public final class b19 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b19(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((yb9) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b19 b19 = new b19(continuation, this.Y);
        b19.X = obj;
        return b19;
    }

    public final Object o(Object obj) {
        Object[] objArr;
        long[] jArr;
        long[] jArr2;
        Object[] objArr2;
        long[] jArr3;
        long[] jArr4;
        int i;
        int i2 = 1;
        wx3.H(obj);
        yb9 yb9 = (yb9) this.X;
        MessagesListWidget messagesListWidget = this.Y;
        k77[] k77Arr = MessagesListWidget.b1;
        ij5 ij5 = (ij5) messagesListWidget.F0.getValue();
        EndlessRecyclerView2 q0 = this.Y.q0();
        if (!ij5.w0) {
            ij5.w0 = true;
            q0.j(ij5);
            ij5.x0 = q0;
        }
        ij5 ij52 = (ij5) this.Y.F0.getValue();
        ij52.getClass();
        long[] jArr5 = yb9.b;
        Object[] objArr3 = yb9.c;
        long[] jArr6 = yb9.a;
        int length = jArr6.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr6[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            jArr4 = jArr6;
                            long j2 = jArr5[i7];
                            er8 er8 = (er8) objArr3[i7];
                            yb9 yb92 = ij52.c;
                            if (yb92.c(j2) == null) {
                                az9 az9 = new az9(ij52.a);
                                jArr3 = jArr5;
                                objArr2 = objArr3;
                                long j3 = er8.a;
                                CharSequence charSequence = er8.c;
                                if (charSequence == null) {
                                    charSequence = "";
                                }
                                az9.b(new ub0(charSequence, j3));
                                int i8 = ij52.X;
                                az9.setBounds(0, 0, i8, i8);
                                az9.c(er8.b);
                                az9.setCallback((hj5) ij52.y0.getValue());
                                yb92.f(j2, az9);
                            } else {
                                jArr3 = jArr5;
                                objArr2 = objArr3;
                            }
                            i = 8;
                        } else {
                            jArr4 = jArr6;
                            jArr3 = jArr5;
                            objArr2 = objArr3;
                            i = i4;
                        }
                        j >>= i;
                        i2 = 1;
                        i6++;
                        i4 = i;
                        jArr6 = jArr4;
                        jArr5 = jArr3;
                        objArr3 = objArr2;
                    }
                    jArr2 = jArr6;
                    jArr = jArr5;
                    objArr = objArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    jArr2 = jArr6;
                    jArr = jArr5;
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3 += i2;
                jArr6 = jArr2;
                jArr5 = jArr;
                objArr3 = objArr;
            }
        }
        String name = ij5.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, wn6.h(ij52.c.e, "avatars.size = "), (Throwable) null);
        }
        this.Y.q0().Y();
        return jue.a;
    }
}
