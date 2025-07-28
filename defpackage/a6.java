package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.messages.settings.FrgMediaSettings;

/* renamed from: a6  reason: default package */
public final /* synthetic */ class a6 implements qf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                amc amc = (amc) obj;
                int i = ActLocalMedias.w1;
                ActLocalMedias actLocalMedias = (ActLocalMedias) obj2;
                actLocalMedias.getClass();
                actLocalMedias.p0(new nd4(amc.a.b(), amc.b));
                return;
            case 1:
                amc amc2 = (amc) obj;
                int i2 = ActPhotoEditor.d1;
                ActPhotoEditor actPhotoEditor = (ActPhotoEditor) obj2;
                actPhotoEditor.getClass();
                actPhotoEditor.j0(new nd4(amc2.a.b(), amc2.b));
                return;
            case 2:
                Collection collection = (Collection) obj;
                mw mwVar = (mw) obj2;
                udd.q(mwVar.b, wn6.h(collection.size(), "ValidateMessagesTimeUseCase find some items for delete, count = "));
                xs7.E((ContextScope) mwVar.g, (hu3) null, (ru3) null, new lw(mwVar, collection, (Continuation) null), 3);
                return;
            case 3:
                n2f n2f = (n2f) obj;
                FrgMediaSettings frgMediaSettings = (FrgMediaSettings) obj2;
                kp kpVar = frgMediaSettings.I1;
                kpVar.getClass();
                kpVar.l("app.media.video.compress", n2f.name());
                frgMediaSettings.K1.d(n2f.ordinal(), "VIDEO_COMPRESSION_MODE_SELECTED");
                frgMediaSettings.w1();
                return;
            case 4:
                ((View) obj2).getWindowVisibleDisplayFrame((Rect) obj);
                return;
            default:
                ((ArrayList) obj2).addAll((List) obj);
                return;
        }
    }
}
