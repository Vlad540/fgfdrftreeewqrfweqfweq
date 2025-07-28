package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: gp8  reason: default package */
public abstract class gp8 {
    public static final /* synthetic */ int a = 0;

    public static ArrayList a(Protos.MessageElements messageElements) {
        ep8 ep8;
        ep8 ep82;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Protos.MessageElement[] messageElementArr = messageElements.elements;
            if (i >= messageElementArr.length) {
                return arrayList;
            }
            Protos.MessageElement messageElement = messageElementArr[i];
            int i2 = messageElement.type;
            Map map = null;
            switch (i2) {
                case 0:
                    ep82 = ep8.a;
                    break;
                case 1:
                    ep82 = ep8.b;
                    break;
                case 2:
                    ep82 = ep8.o;
                    break;
                case 3:
                    ep82 = ep8.c;
                    break;
                case 4:
                    ep82 = ep8.X;
                    break;
                case 5:
                    ep82 = ep8.Y;
                    break;
                case 6:
                    ep82 = ep8.Z;
                    break;
                case 7:
                    ep82 = ep8.x0;
                    break;
                case 8:
                    ep82 = ep8.y0;
                    break;
                case 9:
                    ep82 = ep8.w0;
                    break;
                case 10:
                    ep82 = ep8.z0;
                    break;
                default:
                    Locale locale = Locale.ENGLISH;
                    udd.s("gp8", "Unknown protoElement type = " + i2, (Throwable) null);
                    ep8 = null;
                    break;
            }
            ep8 = ep82;
            long j = messageElement.entityId;
            String str = TextUtils.isEmpty(messageElement.entityName) ? null : messageElement.entityName;
            int i3 = messageElement.from;
            int i4 = messageElement.length;
            Protos.MessageElement.LinkAttributes linkAttributes = messageElement.linkAttributes;
            if (linkAttributes != null) {
                map = Collections.singletonMap("url", linkAttributes.url);
            }
            arrayList.add(new fp8(j, str, ep8, i3, i4, map));
            i++;
        }
    }

    public static byte[] b(List list) {
        return gr8.toByteArray(c(list));
    }

    public static Protos.MessageElements c(List list) {
        Protos.MessageElements messageElements = new Protos.MessageElements();
        messageElements.elements = new Protos.MessageElement[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fp8 fp8 = (fp8) list.get(i);
            Protos.MessageElement messageElement = new Protos.MessageElement();
            messageElement.entityId = fp8.a;
            byte[] bArr = b.a;
            String str = fp8.b;
            if (str == null) {
                str = "";
            }
            messageElement.entityName = str;
            messageElement.from = fp8.d;
            messageElement.length = fp8.e;
            switch (fp8.c.ordinal()) {
                case 0:
                    messageElement.type = 0;
                    break;
                case 1:
                    messageElement.type = 1;
                    break;
                case 2:
                    messageElement.type = 3;
                    break;
                case 3:
                    messageElement.type = 2;
                    break;
                case 4:
                    messageElement.type = 4;
                    break;
                case 5:
                    messageElement.type = 5;
                    Map map = fp8.f;
                    if (map.containsKey("url")) {
                        Protos.MessageElement.LinkAttributes linkAttributes = new Protos.MessageElement.LinkAttributes();
                        messageElement.linkAttributes = linkAttributes;
                        linkAttributes.url = (String) map.get("url");
                        break;
                    } else {
                        throw new IllegalStateException("There are not enough attributes for the type = LINK");
                    }
                case 6:
                    messageElement.type = 6;
                    break;
                case 7:
                    messageElement.type = 9;
                    break;
                case 8:
                    messageElement.type = 7;
                    break;
                case 9:
                    messageElement.type = 8;
                    break;
                case 10:
                    messageElement.type = 10;
                    break;
            }
            messageElements.elements[i] = messageElement;
        }
        return messageElements;
    }
}
