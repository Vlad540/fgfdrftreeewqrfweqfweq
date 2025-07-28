package one.me.dialogs.share.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/dialogs/share/media/ChatMediaDownloadBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "attachId", "", "localAttachId", "", "cause", "snackbarBottomMargin", "", "forceDarkTheme", "(JJLjava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;)V", "share-media_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMediaDownloadBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ k77[] I0;
    public final t97 C0;
    public final t97 D0;
    public final t97 E0;
    public od4 F0;
    public final jr G0;
    public final qda H0;

    static {
        Class<ChatMediaDownloadBottomSheet> cls = ChatMediaDownloadBottomSheet.class;
        I0 = new k77[]{new khb(cls, "forceDarkTheme", "getForceDarkTheme()Z", 0), wn6.e(m7c.a, cls, "snackbarBottomMargin", "getSnackbarBottomMargin()Ljava/lang/Integer;", 0)};
    }

    public ChatMediaDownloadBottomSheet(Bundle bundle) {
        super(bundle);
        t97 createViewModelLazy = createViewModelLazy(zb2.class, new s(24, new p22(13)));
        this.C0 = createViewModelLazy;
        this.D0 = ez3.O(3, new nl1(6, this));
        this.E0 = obd.a.getAccessor().d(hba.class);
        jr jrVar = new jr(Boolean.class, "arg:force_dark");
        this.G0 = new jr(Integer.class, "arg:snack_bot_margin");
        zb2 zb2 = (zb2) createViewModelLazy.getValue();
        long j = bundle.getLong("arg:msg_id");
        long j2 = bundle.getLong("arg:attach_id");
        String string = bundle.getString("arg:local_attach_id");
        if (string != null) {
            bqc bqc = ak4.a;
            int i = bundle.getInt("arg:cause");
            bqc.getClass();
            qda qda = null;
            zb2.C0 = taf.n(zb2, zb2.c.b(), (ru3) null, new sb2(zb2, j, string, (ak4) ak4.y0.get(i), j2, (Continuation) null), 2);
            qda qda2 = qda.a;
            k77 k77 = I0[0];
            this.H0 = ((Boolean) jrVar.a(this)).booleanValue() ? qda2 : qda;
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final t0b m0() {
        return new lb2(this, 0);
    }

    public final void onChangeStarted(wr3 wr3, xr3 xr3) {
        ChatMediaDownloadBottomSheet.super.onChangeStarted(wr3, xr3);
        this.F0 = wr3 instanceof od4 ? (od4) wr3 : null;
    }

    public final void onDestroyView(View view) {
        ChatMediaDownloadBottomSheet.super.onDestroyView(view);
        ((zb2) this.C0.getValue()).r();
        this.F0 = null;
    }

    public final void onViewCreated(View view) {
        ez3.N(new ck5(wx3.e(((zb2) this.C0.getValue()).B0, getViewLifecycleOwner().R(), ob7.o), new mb2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final pda p0() {
        return this.H0;
    }

    public final View w0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        Context context2 = frameLayout2.getContext();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, a24.X(((float) 223) * dh4.c().getDisplayMetrics().density));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        frameLayout3.setLayoutParams(layoutParams2);
        TextView textView = new TextView(frameLayout3.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams3.bottomMargin = a24.X(((float) 27) * dh4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        pda pda = this.H0;
        textView.setTextColor((pda == null ? km4.y0.r(textView) : pda).getText().e);
        ArrayList arrayList = tge.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (d00) this.D0.getValue(), (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        textView.setText(otb.media_share_dialog_generic_share_text);
        frameLayout3.addView(textView);
        frameLayout2.addView(frameLayout3);
        OneMeButton oneMeButton = new OneMeButton(frameLayout2.getContext(), (AttributeSet) null);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, a24.X(((float) 52) * dh4.c().getDisplayMetrics().density), 81));
        oneMeButton.setCustomTheme(pda);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.c);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setText(rhc.h);
        a24.Z(oneMeButton, 300, new jsc(4, this));
        frameLayout2.addView(oneMeButton);
        return frameLayout2;
    }

    public final void z0(int i, int i2) {
        hba hba = (hba) this.E0.getValue();
        hba.i(d8.u(getContext(), i));
        hba.f(new vba(i2));
        k77 k77 = I0[1];
        Integer num = (Integer) this.G0.a(this);
        if (num != null) {
            hba.c(new pba(0, num.intValue(), 3));
        }
        hba.j();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatMediaDownloadBottomSheet(long j, long j2, String str, int i, Integer num, Boolean bool) {
        this(jjd.j(new wia("arg:msg_id", Long.valueOf(j)), new wia("arg:attach_id", Long.valueOf(j2)), new wia("arg:local_attach_id", str), new wia("arg:cause", Integer.valueOf(i)), new wia("arg:snack_bot_margin", num), new wia("arg:force_dark", Boolean.valueOf(bool != null ? bool.booleanValue() : false))));
    }
}
