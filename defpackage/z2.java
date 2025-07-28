package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.chats.picker.PickerChatController;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.devmenu.utils.LongValueBottomSheet;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* renamed from: z2  reason: default package */
public final class z2 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(Editable editable) {
    }

    private final void g(Editable editable) {
    }

    private final void h(Editable editable) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    public final void afterTextChanged(Editable editable) {
        boolean z = true;
        Object obj = this.b;
        int i = 0;
        switch (this.a) {
            case 0:
                return;
            case 1:
                k77[] k77Arr = AddLinkBottomSheet.A0;
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) obj;
                addLinkBottomSheet.getClass();
                OneMeButton oneMeButton = (OneMeButton) addLinkBottomSheet.y0.T0(addLinkBottomSheet, AddLinkBottomSheet.A0[2]);
                if (editable == null || editable.length() == 0 || p0e.J(editable, "https://")) {
                    z = false;
                }
                oneMeButton.setEnabled(z);
                return;
            case 2:
            case 3:
                return;
            case 4:
                MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) obj;
                ActLocalMedias actLocalMedias = mediaBarPreviewLayout.X0;
                if (!(actLocalMedias == null || editable == null)) {
                    actLocalMedias.l0().f.k = editable;
                }
                if (mediaBarPreviewLayout.b1) {
                    if (mediaBarPreviewLayout.V0.f.b() <= 0) {
                        z = false;
                    }
                    mediaBarPreviewLayout.B(z);
                    return;
                }
                return;
            case 5:
                return;
            case 6:
                raa raa = (raa) obj;
                raa.o = editable;
                t97 t97 = raa.J0;
                if (t97.a()) {
                    View view = (View) t97.getValue();
                    if (!(true ^ (editable == null || editable.length() == 0))) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
                oaa oaa = raa.y0;
                if (oaa != null) {
                    oaa.I(editable);
                    return;
                }
                return;
            case 7:
                Object subSequence = editable != null ? editable.subSequence(0, editable.length()) : null;
                if (subSequence == null) {
                    subSequence = BuildConfig.FLAVOR;
                }
                ((u16) obj).invoke(subSequence);
                return;
            default:
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        v3a v3a;
        String str;
        String e;
        String str2 = BuildConfig.FLAVOR;
        boolean z = false;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                wra u0 = ((AbstractPickerScreen) obj).u0();
                String obj2 = charSequence != null ? charSequence.toString() : null;
                u0.getClass();
                if (obj2 != null) {
                    str2 = obj2;
                }
                u0.x0.m((Object) null, str2);
                return;
            case 1:
                return;
            case 2:
                k77[] k77Arr = LogsViewerScreen.Y;
                kq7 l0 = ((LogsViewerScreen) obj).l0();
                if (charSequence != null) {
                    l0.getClass();
                    if (!h0e.c0(charSequence)) {
                        l0.x0.o1(l0, kq7.z0[0], xs7.D(l0.a, l0.c.b(), ru3.b, new jq7(l0, charSequence, (Continuation) null)));
                        l0.q();
                        return;
                    }
                }
                l0.getClass();
                l0.x0.o1(l0, kq7.z0[0], (Object) null);
                l0.w0.m((Object) null, hw4.a);
                return;
            case 3:
                k77[] k77Arr2 = LongValueBottomSheet.H0;
                LongValueBottomSheet longValueBottomSheet = (LongValueBottomSheet) obj;
                longValueBottomSheet.getClass();
                OneMeButton oneMeButton = (OneMeButton) longValueBottomSheet.G0.T0(longValueBottomSheet, LongValueBottomSheet.H0[4]);
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                oneMeButton.setEnabled(!z);
                return;
            case 4:
                return;
            case 5:
                if (i3 > 1) {
                    y7a y7a = (y7a) obj;
                    if (!y7a.w0 && (v3a = y7a.c) != null && (str = v3a.a) != null) {
                        String valueOf = String.valueOf(charSequence);
                        x7a phoneFormatterProvider = y7a.getPhoneFormatterProvider();
                        if (!(phoneFormatterProvider == null || (e = phoneFormatterProvider.e(str, valueOf)) == null)) {
                            valueOf = e;
                        }
                        EditText editText = y7a.A0;
                        editText.removeTextChangedListener(y7a.B0);
                        y7a.setText(valueOf);
                        editText.addTextChangedListener(y7a.B0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
            case 7:
                return;
            case 8:
                k77[] k77Arr3 = PickerChatController.F0;
                xra o0 = ((PickerChatController) obj).o0();
                String obj3 = charSequence != null ? charSequence.toString() : null;
                grd grd = o0.H0;
                if (obj3 != null) {
                    str2 = obj3;
                }
                grd.m((Object) null, str2);
                return;
            case 9:
                ((tsc) obj).onTextChanged(charSequence);
                return;
            case 10:
                k77[] k77Arr4 = ServerHostBottomSheet.K0;
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                serverHostBottomSheet.getClass();
                OneMeButton oneMeButton2 = (OneMeButton) serverHostBottomSheet.J0.T0(serverHostBottomSheet, ServerHostBottomSheet.K0[4]);
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                oneMeButton2.setEnabled(!z);
                return;
            default:
                k77[] k77Arr5 = ServerPortBottomSheet.F0;
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) obj;
                serverPortBottomSheet.getClass();
                OneMeButton oneMeButton3 = (OneMeButton) serverPortBottomSheet.E0.T0(serverPortBottomSheet, ServerPortBottomSheet.F0[1]);
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                oneMeButton3.setEnabled(!z);
                return;
        }
    }
}
