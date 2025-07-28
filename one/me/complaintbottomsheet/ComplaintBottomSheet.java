package one.me.complaintbottomsheet;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/complaintbottomsheet/ComplaintBottomSheet;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "complaint-bottomsheet_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ComplaintBottomSheet extends Widget implements lc3 {
    public static final /* synthetic */ k77[] X;
    public final jr a;
    public final t97 b;
    public final r7e c;
    public final r7e o;

    static {
        khb khb = new khb(ComplaintBottomSheet.class, "chatId", "getChatId()J", 0);
        m7c.a.getClass();
        X = new k77[]{khb};
    }

    public ComplaintBottomSheet() {
        this((Bundle) null, 1, (x54) null);
    }

    public final void i(int i, Bundle bundle) {
        u63 u63 = (u63) this.b.getValue();
        u63.getClass();
        j63[] values = j63.values();
        j63 j63 = (i < 0 || i > values.length + -1) ? null : values[i];
        if (j63 != null) {
            gy9 gy9 = (pk) u63.c.getValue();
            long j = u63.b;
            if (gy9.o(j)) {
                gy9.w(gy9, new s42(gy9.z().a.n(), j, j63));
            }
            taf.o(u63.X, s63.a);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        ComplaintBottomSheet.super.onViewCreated(view);
        t97 t97 = this.b;
        t0c t0c = ((u63) t97.getValue()).o;
        pc7 R = getViewLifecycleOwner().R();
        ob7 ob7 = ob7.o;
        ez3.N(new djc(new n63(wx3.e(t0c, R, ob7), (Continuation) null, this)), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(((u63) t97.getValue()).X, getViewLifecycleOwner().R(), ob7), new l63((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComplaintBottomSheet(Bundle bundle, int i, x54 x54) {
        this((i & 1) != 0 ? null : bundle);
    }

    public ComplaintBottomSheet(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(Long.class, "chat_id");
        this.b = createViewModelLazy(u63.class, new rh2(20, new k63(this, 0)));
        this.c = new r7e(new hk2(16));
        this.o = new r7e(new k63(this, 1));
    }

    public ComplaintBottomSheet(long j) {
        this(jjd.j(new wia("chat_id", Long.valueOf(j))));
    }
}
