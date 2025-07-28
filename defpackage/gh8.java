package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;

/* renamed from: gh8  reason: default package */
public final class gh8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaTypePickerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gh8(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.Y = mediaTypePickerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((gh8) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gh8 gh8 = new gh8(continuation, this.Y);
        gh8.X = obj;
        return gh8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = MediaTypePickerWidget.Y;
        MediaTypePickerWidget mediaTypePickerWidget = this.Y;
        mediaTypePickerWidget.getClass();
        k77 k77 = MediaTypePickerWidget.Y[2];
        ((eh8) this.X).getClass();
        ((ng8) mediaTypePickerWidget.o.getValue()).setSelected(ah8.a);
        return jue.a;
    }
}
