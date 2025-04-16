/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\Admin\\Desktop\\Enhanced_benchmark\\ICC-Bench-master\\rpc_remoteservice\\src\\main\\aidl\\org\\arguslab\\rpc_remoteservice\\IRemoteService.aidl
 */
package org.arguslab.rpc_remoteservice;
// Declare any non-default types here with import statements

public interface IRemoteService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.arguslab.rpc_remoteservice.IRemoteService
{
private static final java.lang.String DESCRIPTOR = "org.arguslab.rpc_remoteservice.IRemoteService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.arguslab.rpc_remoteservice.IRemoteService interface,
 * generating a proxy if needed.
 */
public static org.arguslab.rpc_remoteservice.IRemoteService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.arguslab.rpc_remoteservice.IRemoteService))) {
return ((org.arguslab.rpc_remoteservice.IRemoteService)iin);
}
return new org.arguslab.rpc_remoteservice.IRemoteService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_setData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setData(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.arguslab.rpc_remoteservice.IRemoteService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void setData(java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_setData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void setData(java.lang.String data) throws android.os.RemoteException;
}
