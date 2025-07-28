package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: xs5  reason: default package */
public final class xs5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xs5(Continuation continuation, FoldersPickerScreen foldersPickerScreen) {
        super(2, continuation);
        this.Y = foldersPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((xs5) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xs5 xs5 = new xs5(continuation, this.Y);
        xs5.X = obj;
        return xs5;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [rr3, one.me.folders.pickerfolders.FoldersPickerScreen, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v3, types: [mr5, ig7] */
    public final Object o(Object obj) {
        wx3.H(obj);
        List list = (List) this.X;
        k77[] k77Arr = FoldersPickerScreen.w0;
        ? r5 = this.Y;
        r5.getClass();
        if (list == null || !list.isEmpty()) {
            r5.o.F(list, new oc4(21, r5));
        } else {
            View view = r5.getView();
            ConstraintLayout constraintLayout = view instanceof ConstraintLayout ? (ConstraintLayout) view : null;
            if (constraintLayout != null) {
                k77 k77 = FoldersPickerScreen.w0[4];
                re3 re3 = new re3(0, -2);
                re3.i = 0;
                re3.e = 0;
                re3.h = 0;
                re3.l = 0;
                jjd.e(constraintLayout, (p4a) r5.Z.getValue(), re3);
            }
            k77[] k77Arr2 = FoldersPickerScreen.w0;
            ((RecyclerView) r5.X.T0(r5, k77Arr2[1])).setVisibility(8);
            ((OneMeButton) r5.Y.T0(r5, k77Arr2[3])).setVisibility(8);
        }
        return jue.a;
    }
}
