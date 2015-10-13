lazy val downloadWSDL = SettingKey[Unit]("downloadWSDL")

downloadWSDL := {
  val f = file("service.wsdl")
  if (!f.exists)
    IO.download(url("https://confluence.jetbrains.com/rpc/soap-axis/confluenceservice-v2?wsdl"), file("service.wsdl"))
  println("finished")
}

onLoad := {
  downloadWSDL.value
  onLoad.value
}
