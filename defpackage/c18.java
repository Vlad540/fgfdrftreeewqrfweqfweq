package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: c18  reason: default package */
public final class c18 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ LinearLayout Y;
    public final /* synthetic */ MediaBarWidget Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c18(Continuation continuation, LinearLayout linearLayout, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = linearLayout;
        this.Z = mediaBarWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((c18) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        c18 c18 = new c18(continuation, this.Y, this.Z);
        c18.X = obj;
        return c18;
    }

    public final Object o(Object obj) {
        uwc uwc;
        wx3.H(obj);
        int i = ((Boolean) this.X).booleanValue() ? 0 : 8;
        LinearLayout linearLayout = this.Y;
        linearLayout.setVisibility(i);
        k77[] k77Arr = MediaBarWidget.h1;
        MediaBarWidget mediaBarWidget = this.Z;
        mediaBarWidget.getClass();
        k77[] k77Arr2 = MediaBarWidget.h1;
        k77 k77 = k77Arr2[12];
        RecyclerView recyclerView = (RecyclerView) mediaBarWidget.M0.getValue();
        if (linearLayout.getVisibility() == 0) {
            k77 k772 = k77Arr2[11];
            uwc = (uwc) mediaBarWidget.L0.getValue();
        } else {
            uwc = null;
        }
        recyclerView.setAdapter(uwc);
        return jue.a;
    }
}
