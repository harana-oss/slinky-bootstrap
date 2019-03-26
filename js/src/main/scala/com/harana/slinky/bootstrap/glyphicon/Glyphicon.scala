package com.harana.slinky.bootstrap.glyphicon

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@JSImport("react-bootstrap/lib/Glyphicon", JSImport.Default)
@js.native
object ReactGlyphicon extends js.Object

@react object Glyphicon extends ExternalComponent {

  case class Props(glyph: Option[String] = None,
                   bsClass: Option[String] = None)

  override val component = ReactGlyphicon
}