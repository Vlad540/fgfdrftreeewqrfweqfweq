package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: nn3  reason: default package */
public abstract class nn3 {
    public static on3 a(byte[] bArr) {
        int i;
        int i2 = 4;
        try {
            Tasks.ContactUpdate mergeFrom = gr8.mergeFrom(new Tasks.ContactUpdate(), bArr);
            long j = mergeFrom.requestId;
            long j2 = mergeFrom.contactId;
            String str = mergeFrom.action;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1881281404:
                    if (str.equals("REMOVE")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1785516855:
                    if (str.equals("UPDATE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 64641:
                    if (str.equals("ADD")) {
                        c = 2;
                        break;
                    }
                    break;
                case 63294573:
                    if (str.equals("BLOCK")) {
                        c = 3;
                        break;
                    }
                    break;
                case 424769908:
                    if (str.equals("UNBLOCK")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 3;
                    break;
                case 1:
                    i2 = 5;
                    break;
                case 2:
                    break;
                case 3:
                    i = 1;
                    break;
                case 4:
                    i = 2;
                    break;
                default:
                    throw new IllegalArgumentException(wn6.i("No such value ", str, " for ContactUpdateAction"));
            }
            i = i2;
            return new on3(i, j, j2, mergeFrom.oldName, mergeFrom.oldLastName, mergeFrom.newName, mergeFrom.lastName);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
