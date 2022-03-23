package typealigned

trait Compose[F[_, _]] {
  def compose[A, B, C](f: F[B, C], g: F[A, B]): F[A, C]
}

object Compose {
  def apply[F[_, _]](implicit F: Compose[F]): Compose[F] = F
}

