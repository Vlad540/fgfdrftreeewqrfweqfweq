package defpackage;

import android.graphics.RectF;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: so2  reason: default package */
public final /* synthetic */ class so2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ so2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    public final Object invoke() {
        int i;
        int i2;
        int i3;
        int i4;
        ChatTitleIconScreen chatTitleIconScreen = this.b;
        boolean z = false;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatTitleIconScreen.D0;
                chatTitleIconScreen.q0().C0.m((Object) null, new zo2((String) null, (String) null, (RectF) null));
                return jue.a;
            case 1:
                k77[] k77Arr2 = ChatTitleIconScreen.D0;
                int ordinal = chatTitleIconScreen.p0().ordinal();
                if (ordinal == 0) {
                    return mnc.CREATE_CHAT_INFO;
                }
                if (ordinal == 1) {
                    return mnc.CREATE_CHANNEL_INFO;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                k77[] k77Arr3 = ChatTitleIconScreen.D0;
                nea nea = new nea(chatTitleIconScreen.getContext(), 6);
                nea.setId(kca.j);
                nea.setLayoutParams(new re3(-1, -2));
                nea.setForm(fea.a);
                int ordinal2 = chatTitleIconScreen.p0().ordinal();
                if (ordinal2 == 0) {
                    i = lca.s;
                } else if (ordinal2 == 1) {
                    i = lca.t;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                nea.setTitle(i);
                nea.setLeftActions(new vda(new l(24, nea)));
                return nea;
            case 3:
                k77[] k77Arr4 = ChatTitleIconScreen.D0;
                TextView textView = new TextView(chatTitleIconScreen.getContext());
                textView.setId(kca.f);
                textView.setLayoutParams(new re3(0, -2));
                textView.setGravity(17);
                float f = (float) 12;
                textView.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), 0, a24.X(f * dh4.c().getDisplayMetrics().density), 0);
                int ordinal3 = chatTitleIconScreen.p0().ordinal();
                if (ordinal3 == 0) {
                    i2 = lca.n;
                } else if (ordinal3 == 1) {
                    i2 = lca.o;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setText(i2);
                urd.B(new y9(3, (Continuation) null, 6), textView);
                return textView;
            case 4:
                k77[] k77Arr5 = ChatTitleIconScreen.D0;
                mz9 mz9 = new mz9(chatTitleIconScreen.getContext());
                mz9.setId(kca.h);
                float f2 = (float) 96;
                mz9.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
                mz9.h(mz9, gq3.b(chatTitleIconScreen.getContext(), phc.h0), (gz9) null, 30);
                mz9.setAvatarShape(dz9.a);
                a24.a0(mz9, new ro2(chatTitleIconScreen, 0));
                mz9.setCloseBadgeClickListener(new so2(chatTitleIconScreen, 0));
                return mz9;
            case 5:
                k77[] k77Arr6 = ChatTitleIconScreen.D0;
                mda mda = new mda(chatTitleIconScreen.getContext());
                mda.setId(kca.i);
                mda.setLayoutParams(new re3(0, -2));
                float f3 = (float) 12;
                mda.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f3), 0, a24.X(f3 * dh4.c().getDisplayMetrics().density), 0);
                int ordinal4 = chatTitleIconScreen.p0().ordinal();
                if (ordinal4 == 0) {
                    i3 = lca.q;
                } else if (ordinal4 == 1) {
                    i3 = lca.r;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                mda.setHint(d8.u(mda.getContext(), i3));
                mda.setText(chatTitleIconScreen.q0().K0);
                mda.setBackgroundColorAttr(Integer.valueOf(j9a.a));
                vqc vqc = (vqc) ((xzc) chatTitleIconScreen.b.getValue());
                vqc.getClass();
                mda.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) vqc.o(PmsKey.f70maxthemelength, (long) 200))});
                urd.B(new to2(3, (Continuation) null, 0), mda);
                mda.b(new qo2(chatTitleIconScreen, 0));
                return mda;
            case 6:
                k77[] k77Arr7 = ChatTitleIconScreen.D0;
                xe4 xe4 = new xe4(chatTitleIconScreen.getContext());
                xe4.setId(kca.g);
                re3 re3 = new re3(0, -2);
                float f4 = (float) 12;
                re3.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f4));
                re3.setMarginEnd(a24.X(f4 * dh4.c().getDisplayMetrics().density));
                xe4.setLayoutParams(re3);
                xe4.setMaxCount(((vqc) ((xzc) chatTitleIconScreen.b.getValue())).p());
                xe4.setHint(new hge(lca.p));
                xe4.setText(chatTitleIconScreen.q0().L0);
                xe4.setBackgroundColorAttr(Integer.valueOf(j9a.a));
                xe4.setHintColorAttr(j9a.M);
                urd.B(new z9(3, (Continuation) null, 5), xe4);
                xe4.x0.addTextChangedListener(new ae1(new qo2(chatTitleIconScreen, 1), 2, xe4));
                return xe4;
            default:
                k77[] k77Arr8 = ChatTitleIconScreen.D0;
                OneMeButton oneMeButton = new OneMeButton(chatTitleIconScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(kca.e);
                re3 re32 = new re3(0, -2);
                float f5 = (float) 12;
                re32.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f5));
                re32.setMarginEnd(a24.X(dh4.c().getDisplayMetrics().density * f5));
                re32.bottomMargin = a24.X(f5 * dh4.c().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(re32);
                int ordinal5 = chatTitleIconScreen.p0().ordinal();
                if (ordinal5 == 0) {
                    i4 = lca.l;
                } else if (ordinal5 == 1) {
                    i4 = lca.m;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                oneMeButton.setText(i4);
                oneMeButton.setSize(v0a.c);
                oneMeButton.setMode(u0a.a);
                oneMeButton.setAppearance(s0a.o);
                gp2 q0 = chatTitleIconScreen.q0();
                String str = chatTitleIconScreen.q0().K0;
                q0.getClass();
                if (!h0e.c0(str)) {
                    int length = str.length();
                    vqc vqc2 = (vqc) q0.o;
                    vqc2.getClass();
                    if (length <= ((int) vqc2.o(PmsKey.f70maxthemelength, (long) 200))) {
                        z = true;
                    }
                }
                oneMeButton.setEnabled(z);
                a24.a0(oneMeButton, new ro2(chatTitleIconScreen, 1));
                return oneMeButton;
        }
    }
}
