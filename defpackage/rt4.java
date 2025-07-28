package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* renamed from: rt4  reason: default package */
public final class rt4 implements x84 {
    public final /* synthetic */ pc7 a;
    public final /* synthetic */ EmojiCompatInitializer b;

    public rt4(EmojiCompatInitializer emojiCompatInitializer, pc7 pc7) {
        this.b = emojiCompatInitializer;
        this.a = pc7;
    }

    public final void onResume(nc7 nc7) {
        this.b.getClass();
        w93.a(Looper.getMainLooper()).postDelayed(new qzf(3), 500);
        this.a.f(this);
    }
}
