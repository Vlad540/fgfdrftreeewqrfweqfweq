package defpackage;

import android.animation.IntEvaluator;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: l4c  reason: default package */
public final class l4c extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ RecordControlsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l4c(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.Y = recordControlsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l4c l4c = new l4c(continuation, this.Y);
        l4c.X = obj;
        return l4c;
    }

    public final Object o(Object obj) {
        byte[] bArr;
        lr lrVar;
        Object[] objArr;
        wx3.H(obj);
        byte[] bArr2 = (byte[]) this.X;
        k77[] k77Arr = RecordControlsWidget.m1;
        RecordControlsWidget recordControlsWidget = this.Y;
        q60 N0 = recordControlsWidget.N0();
        Long l = (Long) recordControlsWidget.L0().D0.a.getValue();
        long longValue = l != null ? l.longValue() : 0;
        N0.w0 = bArr2;
        N0.G0 = longValue;
        N0.x0 = 0;
        int i = 0;
        N0.y0 = false;
        Paint paint = N0.A0;
        km4.y0.r(N0);
        paint.setColor(r1g.G(-16745729, 0.5f));
        Path path = N0.D0;
        if (!path.isEmpty()) {
            path.reset();
        }
        if (N0.getMeasuredWidth() != 0) {
            if (!(N0.getMeasuredWidth() == 0 || (bArr = N0.w0) == null)) {
                lr lrVar2 = N0.E0;
                IntEvaluator intEvaluator = q60.J0;
                if (lrVar2 == null) {
                    int peaksCount = N0.getPeaksCount();
                    r2 r2Var = new r2();
                    if (peaksCount == 0) {
                        objArr = lr.o;
                    } else if (peaksCount > 0) {
                        objArr = new Object[peaksCount];
                    } else {
                        throw new IllegalArgumentException(wn6.h(peaksCount, "Illegal Capacity: "));
                    }
                    r2Var.b = objArr;
                    N0.E0 = r2Var;
                    if (bArr.length > 1) {
                        byte[] bArr3 = N0.w0;
                        if (bArr3 != null) {
                            for (byte b : cs.T(bArr3.length - Math.min(bArr3.length, N0.getPeaksCount()), bArr3, bArr3.length)) {
                                Byte b2 = N0.F0;
                                byte intValue = (byte) q60.J0.evaluate(0.5f, Integer.valueOf(b2 != null ? b2.byteValue() : 0), Integer.valueOf(b)).intValue();
                                lr lrVar3 = N0.E0;
                                if (lrVar3 != null) {
                                    lrVar3.b(Byte.valueOf(intValue));
                                }
                                N0.F0 = Byte.valueOf(intValue);
                            }
                        }
                    }
                }
                byte[] bArr4 = N0.w0;
                if (bArr4 != null) {
                    Byte b3 = N0.F0;
                    if (b3 == null) {
                        N0.F0 = (byte) 0;
                        lr lrVar4 = N0.E0;
                        if (lrVar4 != null) {
                            lrVar4.b((byte) 0);
                        }
                    } else {
                        byte byteValue = b3.byteValue();
                        if (bArr4.length != 0) {
                            byte intValue2 = (byte) q60.J0.evaluate(0.5f, Integer.valueOf(byteValue), Integer.valueOf(bArr4[bArr4.length - 1])).intValue();
                            lr lrVar5 = N0.E0;
                            if (lrVar5 != null) {
                                i = lrVar5.c;
                            }
                            if (i == N0.getPeaksCount() && (lrVar = N0.E0) != null) {
                                Byte b4 = (Byte) lrVar.j();
                            }
                            lr lrVar6 = N0.E0;
                            if (lrVar6 != null) {
                                lrVar6.b(Byte.valueOf(intValue2));
                            }
                            N0.F0 = Byte.valueOf(intValue2);
                        } else {
                            throw new NoSuchElementException("Array is empty.");
                        }
                    }
                }
            }
            lr lrVar7 = N0.E0;
            float measuredHeight = ((float) N0.getMeasuredHeight()) / 2.0f;
            path.reset();
            if (lrVar7 != null && !lrVar7.isEmpty()) {
                float f = N0.o;
                float width = ((float) N0.getWidth()) - (f / 2.0f);
                int size = lrVar7.getSize() - 1;
                if (size >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        float measuredHeight2 = (((float) N0.getMeasuredHeight()) / 127.0f) * ((float) ((Number) lrVar7.get(size)).byteValue());
                        float f2 = N0.b;
                        if (measuredHeight2 < f2) {
                            measuredHeight2 = f2;
                        }
                        float f3 = measuredHeight2 / 2.0f;
                        path.moveTo(width, measuredHeight - f3);
                        path.lineTo(width, f3 + measuredHeight);
                        width = (width - f) - N0.c;
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                }
            }
        }
        N0.postInvalidate();
        return jue.a;
    }
}
