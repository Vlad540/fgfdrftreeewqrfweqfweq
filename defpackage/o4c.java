package defpackage;

import android.graphics.Path;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: o4c  reason: default package */
public final class o4c extends l5e implements i26 {
    public final /* synthetic */ RecordControlsWidget X;
    public final /* synthetic */ byte[] Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o4c(Continuation continuation, RecordControlsWidget recordControlsWidget, byte[] bArr) {
        super(2, continuation);
        this.X = recordControlsWidget;
        this.Y = bArr;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o4c(continuation, this.X, this.Y);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = RecordControlsWidget.m1;
        q60 N0 = this.X.N0();
        N0.y0 = true;
        Path path = N0.D0;
        if (!path.isEmpty()) {
            path.reset();
        }
        byte[] bArr = this.Y;
        if (bArr != null) {
            float measuredHeight = ((float) N0.getMeasuredHeight()) / 2.0f;
            path.reset();
            if (true ^ (bArr.length == 0)) {
                float f = N0.o;
                float width = ((float) N0.getWidth()) - (f / 2.0f);
                int length = bArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        float measuredHeight2 = (((float) N0.getMeasuredHeight()) / 127.0f) * ((float) bArr[length]);
                        float f2 = N0.b;
                        if (measuredHeight2 < f2) {
                            measuredHeight2 = f2;
                        }
                        float f3 = measuredHeight2 / 2.0f;
                        path.moveTo(width, measuredHeight - f3);
                        path.lineTo(width, f3 + measuredHeight);
                        width = (width - f) - N0.c;
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                }
            }
            N0.invalidate();
        }
        return jue.a;
    }
}
