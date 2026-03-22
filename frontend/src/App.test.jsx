import { render, screen } from "@testing-library/react"
import "@testing-library/jest-dom"
import App from "./App"

global.fetch = () =>
  Promise.resolve({
    ok: true,
    json: () => Promise.resolve([]),
  })

test("muestra el título SPA Relax", async () => {
  render(<App />)

  const titulo = await screen.findByText("SPA Relax")

  expect(titulo).toBeInTheDocument()
})