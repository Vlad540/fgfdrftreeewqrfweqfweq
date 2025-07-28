package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* renamed from: j98  reason: default package */
public final class j98 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j98(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j98 j98 = new j98(continuation, this.Y);
        j98.X = obj;
        return j98;
    }

    public final Object o(Object obj) {
        float f;
        wx3.H(obj);
        ivc ivc = (ivc) this.X;
        boolean z = ivc instanceof hvc;
        MediaPickerScreen mediaPickerScreen = this.Y;
        if (z) {
            k77[] k77Arr = MediaPickerScreen.F0;
            mediaPickerScreen.n0().setDropdownRotationProgress(0.0f);
            k77[] k77Arr2 = MediaPickerScreen.F0;
            k77 k77 = k77Arr2[4];
            mediaPickerScreen.z0.b(mediaPickerScreen, 0);
            k77 k772 = k77Arr2[3];
            ((az1) mediaPickerScreen.y0.getValue()).setVisibility(8);
            k77 k773 = k77Arr2[7];
            ((View) mediaPickerScreen.C0.getValue()).setVisibility(8);
        } else if (ivc instanceof fvc) {
            k77[] k77Arr3 = MediaPickerScreen.F0;
            mediaPickerScreen.getClass();
            k77[] k77Arr4 = MediaPickerScreen.F0;
            k77 k774 = k77Arr4[4];
            jr jrVar = mediaPickerScreen.z0;
            if (((Number) jrVar.a(mediaPickerScreen)).intValue() > 0) {
                k77 k775 = k77Arr4[4];
                f = ((float) ((fvc) ivc).a) / ((float) ((Number) jrVar.a(mediaPickerScreen)).intValue());
            } else {
                f = 180.0f;
            }
            mediaPickerScreen.n0().setDropdownRotationProgress(f);
        }
        return jue.a;
    }
}
