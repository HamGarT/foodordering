import { useState } from 'react'
import Navbar from './components/Navbar/Navbar';
import {
  BrowserRouter,
  Routes,
  Route,
} from "react-router-dom";
import Home from './pages/Home/Home';
import './App.css'

function App() {

  return (
    <BrowserRouter>
      <nav className="sticky top-0 z-50">
        <Navbar />
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
      </Routes>
    </BrowserRouter>

  )
}

export default App
