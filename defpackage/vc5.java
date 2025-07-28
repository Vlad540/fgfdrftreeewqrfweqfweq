package defpackage;

import android.graphics.Typeface;
import android.view.View;
import ru.ok.messages.media.attaches.FileAttachView;

/* renamed from: vc5  reason: default package */
public final /* synthetic */ class vc5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileAttachView b;

    public /* synthetic */ vc5(FileAttachView fileAttachView, int i) {
        this.a = i;
        this.b = fileAttachView;
    }

    public final void onClick(View view) {
        FileAttachView fileAttachView = this.b;
        switch (this.a) {
            case 0:
                FileAttachView.w(fileAttachView);
                return;
            default:
                Typeface typeface = FileAttachView.b1;
                fileAttachView.getClass();
                return;
        }
    }
}
