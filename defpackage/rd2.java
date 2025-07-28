package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.profile.screens.media.ChatMediaListWidget;

/* renamed from: rd2  reason: default package */
public final class rd2 extends lx3 {
    public static final y76 F0 = new y76(8);
    public final /* synthetic */ int A0 = 0;
    public final long B0;
    public List C0;
    public final Object D0;
    public final Object E0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rd2(rr3 rr3, long j) {
        super(rr3, 1);
        y76 y76 = F0;
        this.D0 = rr3;
        this.B0 = j;
        this.E0 = y76;
        this.C0 = o23.s0(ie2.o);
    }

    public final void E(sgc sgc, int i) {
        rr3 rr3;
        switch (this.A0) {
            case 0:
                if (!sgc.n()) {
                    ((y76) this.E0).getClass();
                    ChatMediaListWidget chatMediaListWidget = new ChatMediaListWidget(this.B0, (ie2) this.C0.get(i));
                    chatMediaListWidget.setTargetController((rr3) this.D0);
                    chatMediaListWidget.setRetainViewMode(qr3.b);
                    sgc.R(new vgc(chatMediaListWidget, (String) null, (wr3) null, (wr3) null, false, -1));
                    return;
                }
                return;
            default:
                if (!sgc.n() && i >= 0 && i <= p23.A(this.C0)) {
                    int i2 = c87.$EnumSwitchMapping$0[((l87) this.C0.get(i)).ordinal()];
                    qr3 qr3 = qr3.b;
                    String str = (String) this.E0;
                    if (i2 == 1) {
                        rr3 keyboardStickersWidget = new KeyboardStickersWidget(this.B0, str, (x54) null);
                        keyboardStickersWidget.c = (er7) this.D0;
                        keyboardStickersWidget.setRetainViewMode(qr3);
                        rr3 = keyboardStickersWidget;
                    } else if (i2 == 2) {
                        rr3 keyboardEmojiWidget = new KeyboardEmojiWidget(str, (x54) null);
                        keyboardEmojiWidget.setRetainViewMode(qr3);
                        rr3 = keyboardEmojiWidget;
                    } else if (i2 == 3) {
                        rr3 = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (rr3 != null) {
                        sgc.R(new vgc(rr3, (String) null, (wr3) null, (wr3) null, false, -1));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final int j() {
        switch (this.A0) {
            case 0:
                return this.C0.size();
            default:
                return this.C0.size();
        }
    }

    public final long k(int i) {
        switch (this.A0) {
            case 0:
                return (long) ((ie2) this.C0.get(i)).ordinal();
            default:
                return (long) ((l87) this.C0.get(i)).c;
        }
    }

    public rd2(rr3 rr3, er7 er7, long j, String str) {
        super(rr3, 1);
        this.D0 = er7;
        this.B0 = j;
        this.E0 = str;
        this.C0 = hw4.a;
    }
}
