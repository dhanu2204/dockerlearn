import React,{useState, useEffect} from 'react'

const Input = () => {
  const [name,setName] = useState("")
  const [password,setPassword] = useState("")

  const handleSubmit= async(e) => {
    e.preventDefault()
    try {
      const response = await fetch(`${import.meta.env.VITE_BACKENDURL}/add`,{
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        }, body: JSON.stringify({name, password}),
      });
      if(response.ok)
      {
        alert("successfull")
      }
      else{
        alert("Unsuccessfull")
      }
    } catch (error) {
      console.error(error);
    }
  }
  return (
    <div>
    <div>Hii this is my first docker practice</div>
    <form onSubmit={handleSubmit}>
    <input type="text" placeholder="Enter full name"value={name} onChange={(e)=>setName(e.target.value) } />
    <input type="text" placeholder="enter password" value={password} onChange={(e)=>setPassword(e.target.value)}/>
    <button type="Submit">Signup</button>
    </form>
    </div>
  )
}

export default Input